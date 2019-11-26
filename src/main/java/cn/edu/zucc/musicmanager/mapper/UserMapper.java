package cn.edu.zucc.musicmanager.mapper;

import cn.edu.zucc.musicmanager.result.Chartpara;
import cn.edu.zucc.musicmanager.result.Chartres;
import org.apache.ibatis.annotations.Mapper;

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

    public ArrayList<Chartres> getuserGender();

    public ArrayList<Chartres> getuserArea();

    public ArrayList<Long> getuserAge();

    public int getuserFollows(Chartpara chartpara);

    public int getuserFollowed(Chartpara chartpara);

    public int getuserPlaylist(Chartpara chartpara);

    public int getuserEventcount(Chartpara chartpara);
}
