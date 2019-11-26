package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.mapper.SongMapper;
import cn.edu.zucc.musicmanager.model.SongComment;
import cn.edu.zucc.musicmanager.result.Chartdata;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("SongService")
public class SongService{


    @Resource
    private SongMapper songMapper;

    public ArrayList<String> getAllLyric(int offset){
        return songMapper.getAllLyric(offset);
    }

    public ArrayList<Chartdata> getCommentsendtime(){

        ArrayList<Chartdata> res = new ArrayList<>();
        ArrayList<Long> sendtimes = songMapper.getCommentsendtime();

        int[] count = new int[25];

        for (int i = 0;i<sendtimes.size();i++){

            Date date = new Date(sendtimes.get(i)+8*3600*1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            count[hour]++;
        }

        for (int i = 0;i<24;i+=1){
            res.add(new Chartdata(i+"点",count[i]));
        }

        return res;

    }

    public ArrayList<SongComment> getHotComment(int limit){
        return songMapper.getHotComment(limit);
    }

}
