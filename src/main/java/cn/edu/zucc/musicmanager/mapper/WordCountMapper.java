package cn.edu.zucc.musicmanager.mapper;

import cn.edu.zucc.musicmanager.model.WordCountInfo;
import org.apache.ibatis.annotations.Mapper;
import cn.edu.zucc.musicmanager.model.PlayInfo;

import java.util.ArrayList;


@Mapper
public interface WordCountMapper {

    public ArrayList<WordCountInfo> getLyricWC();

    public ArrayList<WordCountInfo> getSignatureWC();

    public ArrayList<WordCountInfo> getPlaydescriptionWC();
}
