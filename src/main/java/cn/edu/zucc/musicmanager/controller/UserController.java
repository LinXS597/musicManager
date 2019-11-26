package cn.edu.zucc.musicmanager.controller;

import cn.edu.zucc.musicmanager.model.JsonResult;
import cn.edu.zucc.musicmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAllSignature")
    @ResponseBody
    public ArrayList<String> getAllSignature(@RequestParam("offset") int offset){
        return userService.getAllSignature(offset);
    }

    @RequestMapping("getuserGender")
    @ResponseBody
    public JsonResult<List> getuserGender(){
        return new JsonResult<>(userService.getuserGender());
    }


    @RequestMapping("getuserArea")
    @ResponseBody
    public JsonResult<List> getuserArea(){
        return new JsonResult<>(userService.getuserArea());
    }

    @RequestMapping("getuserAge")
    @ResponseBody
    public JsonResult<List> getuserAge(){
        return new JsonResult<>(userService.getuserAge());
    }

    @RequestMapping("getFollows")
    @ResponseBody
    public JsonResult<List> getuserFollows(){
        return new JsonResult<>(userService.getuserFollows());
    }

    @RequestMapping("getFollowed")
    @ResponseBody
    public JsonResult<List> getuserFollowed(){
        return new JsonResult<>(userService.getuserFollowed());
    }

    @RequestMapping("getuserPlaylist")
    @ResponseBody
    public JsonResult<List> getuserPlaylist(){
        return new JsonResult<>(userService.getuserPlaylist());
    }

    @RequestMapping("getuserEventcount")
    @ResponseBody
    public JsonResult<List> getuserEventcount(){
        return new JsonResult<>(userService.getuserEventcount());
    }
}
