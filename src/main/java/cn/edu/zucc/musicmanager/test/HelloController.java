package cn.edu.zucc.musicmanager.test;

import cn.edu.zucc.musicmanager.mapper.SongMapper;
import cn.edu.zucc.musicmanager.model.SongComment;
import cn.edu.zucc.musicmanager.service.SongService;
import org.python.core.PyList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class HelloController {

    @Autowired
    private SongService songService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello,StringBoot!";
    }

    @RequestMapping("world")
    @ResponseBody
    public String world(){

//        ArrayList<SongComment> res = songService.getHotComment(100);
//
//
//        for (int i = 0;i < res.size();i++){
//            System.out.println("处理第"+i+"条评论");
//            SongComment songComment = res.get(i);
//
//            double t = songService.judge(songComment.getContent());
//            if (t>=0.5){
//                songComment.setFlag(1);
//            }
//            else{
//                songComment.setFlag(0);
//            }
//
//            songService.updateCommentflag(songComment);
//        }



        return "world";
    }
}