package qst.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import qst.demo.dao.User;
import qst.demo.service.UserServiceImpl;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping("/insert")
    public String insert(String user_id,String user_name){
       return userService.insert(new User(user_id,user_name));
    }


    @ResponseBody
    @RequestMapping("/delete")
    public String delete(String user_id){
        return userService.delete(user_id);
    }

    @ResponseBody
    @RequestMapping("/modify")
    public String modify(String user_id,String user_name){
        return userService.modify(new User(user_id,user_name));
    }


    @ResponseBody
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
