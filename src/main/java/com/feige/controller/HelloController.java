package com.feige.controller;

import com.feige.config.Person;
import com.feige.pojo.User;
import com.feige.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@Controller
public class HelloController {

    private static final Logger logger= LoggerFactory.getLogger(HelloController.class);

   @Autowired
    private DataSource dataSource;

    @Autowired
    UserService userService;

    @Autowired
    Person person;

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello, spring boot!"+dataSource;
    }

    @GetMapping("getUser")
    @ResponseBody
    public User getUser(){
        return userService.queryById(16);
    }

    @GetMapping("getAll")

    public String getAll(ModelMap model){

        List<User> users=userService.queryAll();

        model.addAttribute("users",users);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        return "users";
    }
    @GetMapping("getper")
    @ResponseBody
    public  Person getPerson(){
        logger.info("==================================================");
        logger.info(person.toString());
        logger.info("==================================================");
        return person;
    }
}
