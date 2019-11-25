package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.mapper.SongMapper;
import cn.edu.zucc.musicmanager.mapper.UserMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.mapper.PlayMapper;

import java.util.ArrayList;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("UserService")
public class UserService{


    @Resource
    private UserMapper userMapper;


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

    public ArrayList<String> getAllSignature(int offset){
        return userMapper.getAllSignature(offset);
    }

}
