package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.result.Chartdata;
import cn.edu.zucc.musicmanager.result.Chartpara;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.mapper.PlayMapper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("PlayService")
public class PlayService{


    @Resource
    private PlayMapper playMapper;


    public PlayInfo find(String id){
        return playMapper.find(id);
    }

    public ArrayList<String> getAllPlaydescription(int offset){
        return playMapper.getAllPlaydescription(offset);
    }

    public ArrayList<Chartdata> getAllPlaysendtime(){

        ArrayList<Chartdata> res = new ArrayList<>();

        ArrayList<Long> birthdays = playMapper.getAllPlaysendtime();

        int[] count = new int[25];

        for (int i = 0;i<birthdays.size();i++)
        {
            Date date = new Date(birthdays.get(i)+8*3600*1000);
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

    public ArrayList<PlayInfo> getTenhotPlay(){
        return playMapper.getTenhotPlay();
    }

    public ArrayList<Chartdata> getPlaycount(){

        ArrayList<Chartdata> res = new ArrayList<>();

        res.add(new Chartdata("0-100000",playMapper.getPlaycount(new Chartpara(0,100000))));
        res.add(new Chartdata("100000-500000",playMapper.getPlaycount(new Chartpara(10000,500000))));
        res.add(new Chartdata("500000-1000000",playMapper.getPlaycount(new Chartpara(500000,1000000))));
        res.add(new Chartdata("1000000-",playMapper.getPlaycount(new Chartpara(1000000,Integer.MAX_VALUE))));

        return res;

    }

    public ArrayList<Chartdata> getSharecount(){
        ArrayList<Chartdata> res = new ArrayList<>();

        res.add(new Chartdata("0-100",playMapper.getSharecount(new Chartpara(0,100))));
        res.add(new Chartdata("100-500",playMapper.getSharecount(new Chartpara(100,500))));
        res.add(new Chartdata("500-1000",playMapper.getSharecount(new Chartpara(500,1000))));
        res.add(new Chartdata("1000-",playMapper.getSharecount(new Chartpara(1000,Integer.MAX_VALUE))));

        return res;
    }

    public ArrayList<Chartdata> getCommentcount(){
        ArrayList<Chartdata> res = new ArrayList<>();

        res.add(new Chartdata("0-100",playMapper.getCommentcount(new Chartpara(0,100))));
        res.add(new Chartdata("100-500",playMapper.getCommentcount(new Chartpara(100,500))));
        res.add(new Chartdata("500-1000",playMapper.getCommentcount(new Chartpara(500,1000))));
        res.add(new Chartdata("1000-",playMapper.getCommentcount(new Chartpara(1000,Integer.MAX_VALUE))));

        return res;
    }
}
