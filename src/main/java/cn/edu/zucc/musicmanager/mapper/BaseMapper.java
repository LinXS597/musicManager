package cn.edu.zucc.musicmanager.mapper;

import cn.edu.zucc.musicmanager.result.Chartdata;
import org.apache.ibatis.annotations.Mapper;
import cn.edu.zucc.musicmanager.model.PlayInfo;

import java.util.ArrayList;


@Mapper
public interface BaseMapper {

    public int getSongdata();

    public int getPlaydata();

    public int getUserdata();

    public int getCommentdata();

}
