package com.yitianyigexiangfa.watermelon.controller;

import com.alibaba.fastjson.JSON;
import com.yitianyigexiangfa.watermelon.entity.ResponseDO;
import com.yitianyigexiangfa.watermelon.entity.User;
import com.yitianyigexiangfa.watermelon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    public String hi() {
        return new ResponseDO(true, "Success", "Hello, world!").toString();
    }

    @PostMapping("/user")
    public String insert(@RequestBody String userJson) {
        User user = JSON.parseObject(userJson, User.class);
        userService.insert(user);
        return new ResponseDO(true, "Success", "insert Success").toString();
    }

    @PutMapping("/user")
    public String update(@RequestBody String userJson) {
        User user = JSON.parseObject(userJson, User.class);
        userService.update(user);
        return new ResponseDO(true, "Success", "update Success").toString();
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable long id) {
        userService.delete(id);
        return new ResponseDO(true, "Success", "delete Success").toString();
    }

    @GetMapping("/user/{id}")
    public String getById(@PathVariable long id) {
        User user = userService.findById(id);
        return new ResponseDO(true, "Success", user).toString();
    }

    @GetMapping("/users")
    public String getAllUser() {
        List<User> users = userService.getAll();
        return new ResponseDO(true, "Success", users).toString();
    }

}
