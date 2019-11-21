package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.mapper.PlayMapper;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("PlayService")
public class PlayService{


    @Resource
    private PlayMapper playMapper;


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

    public PlayInfo find(String id){
        return playMapper.find(id);
    }
}
