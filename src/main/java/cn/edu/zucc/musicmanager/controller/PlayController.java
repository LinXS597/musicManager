package cn.edu.zucc.musicmanager.controller;


import cn.edu.zucc.musicmanager.model.JsonResult;
import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlayController {

    @Autowired
    private PlayService playService;

    @RequestMapping("getPlay")
    @ResponseBody
    public PlayInfo getPlay(@RequestParam("playid") String id){
        return playService.find(id);
    }


    @RequestMapping("getAllPlaydescription")
    @ResponseBody
    public ArrayList<String> getAllPlaydescription(@RequestParam("offset") int offset){
        return playService.getAllPlaydescription(offset);
    }

    @RequestMapping("getAllPlaysendtime")
    @ResponseBody
    public JsonResult<List> getAllPlaysendtime(){
        return new JsonResult<>(playService.getAllPlaysendtime());
    }

    @RequestMapping("getTenhotPlay")
    @ResponseBody
    public JsonResult<List> getTenhotPlay(){
        return new JsonResult<>(playService.getTenhotPlay());
    }

    @RequestMapping("getPlaycount")
    @ResponseBody
    public JsonResult<List> getPlaycount(){
        return new JsonResult<>(playService.getPlaycount());
    }

    @RequestMapping("getSharecount")
    @ResponseBody
    public JsonResult<List> getSharecount(){
        return new JsonResult<>(playService.getSharecount());
    }

    @RequestMapping("getCommentcount")
    @ResponseBody
    public JsonResult<List> getCommentcount(){
        return new JsonResult<>(playService.getCommentcount());
    }

}
