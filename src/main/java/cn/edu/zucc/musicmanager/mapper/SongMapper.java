package cn.edu.zucc.musicmanager.mapper;

import cn.edu.zucc.musicmanager.model.SongComment;
import cn.edu.zucc.musicmanager.result.Chartdata;
import org.apache.ibatis.annotations.Mapper;
import cn.edu.zucc.musicmanager.model.PlayInfo;

import java.util.ArrayList;


@Mapper
public interface SongMapper {

//    public void insert(PlayInfo playInfo);
//
//    public void update(PlayInfo user);
//
//    public void delete(int id);
//
//    public PlayInfo find(int id);

    public ArrayList<String> getAllLyric(int offset);

    public ArrayList<Long> getCommentsendtime();

    public ArrayList<SongComment> getHotComment(int limit);


}
