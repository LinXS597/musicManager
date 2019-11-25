package cn.edu.zucc.musicmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import cn.edu.zucc.musicmanager.model.PlayInfo;

import java.util.ArrayList;


@Mapper
public interface UserMapper {

//    public void insert(PlayInfo playInfo);
//
//    public void update(PlayInfo user);
//
//    public void delete(int id);
//
//    public PlayInfo find(int id);

    public ArrayList<String> getAllSignature(int offset);
}
