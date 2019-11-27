package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.mapper.SongMapper;
import cn.edu.zucc.musicmanager.model.SongComment;
import cn.edu.zucc.musicmanager.result.Chartdata;
import cn.edu.zucc.musicmanager.result.Chartpara;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.InputStreamReader;
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

    public Double judge(String comment){

        double res = 0;

        try {

            String pythonpath = "/Users/linxs/anaconda3/envs/tf2/bin/python";
            String filepath = "/Users/linxs/Downloads/test.py";
            String s3 = comment;
            String[] arguments = new String[] {pythonpath, filepath, s3};
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            //String result = "";

            while ((line = in.readLine()) != null) {
                System.out.println(line);
                res = Double.valueOf(line);
            }



            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }


        return res;
    }

    public void updateCommentflag(SongComment songComment){
        songMapper.updateCommentflag(songComment);
    }

    public ArrayList<Chartdata> getCommentjudge(){
        ArrayList<Chartdata> res = new ArrayList<>();

        res.add(new Chartdata("极端评论",songMapper.getCommentjudge(0)));
        res.add(new Chartdata("负面评论",songMapper.getCommentjudge(1)));
        res.add(new Chartdata("平平淡淡",songMapper.getCommentjudge(2)));
        res.add(new Chartdata("较为正面",songMapper.getCommentjudge(3)));
        res.add(new Chartdata("积极向上",songMapper.getCommentjudge(4)));

        return res;
    }
}
