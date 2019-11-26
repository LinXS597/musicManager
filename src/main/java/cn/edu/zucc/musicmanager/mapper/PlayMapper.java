package cn.edu.zucc.musicmanager.mapper;

import cn.edu.zucc.musicmanager.result.Chartpara;
import org.apache.ibatis.annotations.Mapper;
import cn.edu.zucc.musicmanager.model.PlayInfo;

import java.util.ArrayList;


@Mapper
public interface PlayMapper {

//    public void insert(PlayInfo playInfo);
//
//    public void update(PlayInfo user);
//
//    public void delete(int id);
//
//    public PlayInfo find(int id);

    public PlayInfo find(String id);

    public ArrayList<String> getAllPlaydescription(int offset);

    public ArrayList<Long> getAllPlaysendtime();

    public ArrayList<PlayInfo> getTenhotPlay();

    public int getPlaycount(Chartpara chartpara);

    public int getSharecount(Chartpara chartpara);

    public int getCommentcount(Chartpara chartpara);
}
