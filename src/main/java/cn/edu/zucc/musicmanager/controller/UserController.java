package cn.edu.zucc.musicmanager.controller;

import cn.edu.zucc.musicmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAllSignature")
    @ResponseBody
    public ArrayList<String> getAllSignature(@RequestParam("offset") int offset){
        return userService.getAllSignature(offset);
    }

}
