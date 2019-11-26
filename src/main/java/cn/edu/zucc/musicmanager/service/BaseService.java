package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.mapper.BaseMapper;
import cn.edu.zucc.musicmanager.result.Chartdata;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.mapper.PlayMapper;

import java.util.ArrayList;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("BaseService")
public class BaseService{


    @Resource
    private BaseMapper baseMapper;


    public ArrayList<Chartdata> getDatanum(){

        ArrayList<Chartdata> res = new ArrayList<>();

        res.add(new Chartdata("play",baseMapper.getPlaydata()));
        res.add(new Chartdata("song",baseMapper.getSongdata()));
        res.add(new Chartdata("user",baseMapper.getUserdata()));
        res.add(new Chartdata("comment",baseMapper.getCommentdata()));


        return res;
    }
}
