package cn.edu.zucc.musicmanager.controller;


import cn.edu.zucc.musicmanager.model.JsonResult;
import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.service.PlayService;
import cn.edu.zucc.musicmanager.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("getAllLyric")
    @ResponseBody
    public ArrayList<String> getPlay(@RequestParam("offset") int offset){
        return songService.getAllLyric(offset);
    }

    @RequestMapping("getCommentsendtime")
    @ResponseBody
    public JsonResult<List> getCommentsendtime(){
        return new JsonResult<>(songService.getCommentsendtime());
    }

    @RequestMapping("getHotComment")
    @ResponseBody
    public JsonResult<List> getHotComment(@RequestParam("limit") int limit){
        return new JsonResult<>(songService.getHotComment(limit));
    }

}
