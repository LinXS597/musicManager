package cn.edu.zucc.musicmanager.controller;

import cn.edu.zucc.musicmanager.model.JsonResult;
import cn.edu.zucc.musicmanager.model.WordCountInfo;
import cn.edu.zucc.musicmanager.service.UserService;
import cn.edu.zucc.musicmanager.service.WordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WordCountController {

    @Autowired
    private WordCountService wordCountService;

    @RequestMapping("getLyricWC")
    @ResponseBody
    public JsonResult<List> getAllSignature(){
        return new JsonResult<>(wordCountService.getLyricWC());
    }

    @RequestMapping("getSignatureWC")
    @ResponseBody
    public JsonResult<List> getSignatureWC(){
        return new JsonResult<>(wordCountService.getSignatureWC());
    }

    @RequestMapping("getPlaydescriptionWC")
    @ResponseBody
    public JsonResult<List> getPlaydescriptionWC(){
        return new JsonResult<>(wordCountService.getPlaydescriptionWC());
    }
}
