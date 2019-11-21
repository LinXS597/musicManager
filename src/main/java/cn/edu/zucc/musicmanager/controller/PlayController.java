package cn.edu.zucc.musicmanager.controller;


import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlayController {

    @Autowired
    private PlayService playService;

    @RequestMapping("/getPlay")
    public PlayInfo getPlay(@RequestParam("playid") String id){
        return playService.find(id);
    }

}
