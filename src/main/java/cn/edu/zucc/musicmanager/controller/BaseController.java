package cn.edu.zucc.musicmanager.controller;


import cn.edu.zucc.musicmanager.model.JsonResult;
import cn.edu.zucc.musicmanager.model.PlayInfo;
import cn.edu.zucc.musicmanager.service.BaseService;
import cn.edu.zucc.musicmanager.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {

    @Autowired
    private BaseService baseService;

    @RequestMapping("getDatanum")
    @ResponseBody
    public JsonResult<List> getPlay(){
        return new JsonResult<>(baseService.getDatanum());
    }




}
