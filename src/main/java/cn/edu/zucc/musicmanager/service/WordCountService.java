package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.mapper.SongMapper;
import cn.edu.zucc.musicmanager.mapper.UserMapper;
import cn.edu.zucc.musicmanager.mapper.WordCountMapper;
import cn.edu.zucc.musicmanager.model.WordCountInfo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.mapper.PlayMapper;

import java.util.ArrayList;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("WordCountService")
public class WordCountService{


    @Resource
    private WordCountMapper wordCountMapper;


//    public void insert(PlayInfo playInfo) {
//        playMapper.insert(playInfo);
//    }
//
//    public void update(PlayInfo playInfo) {
//        playMapper.update(playInfo);
//    }
//
//    public PlayInfo find(int id) {
//        return playMapper.find(id);
//    }
//
//    public void delete(int id){
//        playMapper.delete(id);
//    }

    public ArrayList<WordCountInfo> getLyricWC(){
        return wordCountMapper.getLyricWC();
    }

    public ArrayList<WordCountInfo> getSignatureWC(){
        return wordCountMapper.getSignatureWC();
    }

    public ArrayList<WordCountInfo> getPlaydescriptionWC(){
        return wordCountMapper.getPlaydescriptionWC();
    }

}
