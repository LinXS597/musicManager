package cn.edu.zucc.musicmanager.controller;


import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

}
