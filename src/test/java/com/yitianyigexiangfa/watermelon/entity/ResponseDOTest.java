package com.yitianyigexiangfa.watermelon.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResponseDOTest {

    @Test
    public void test() {
        User user = new User();
        user.setId(1);
        user.setName("liubei");
        user.setEmail("liubei@qq.com");
        user.setPassword("liubeiPassword");
        ResponseDO responseDO = new ResponseDO(true, "Success", user);
        System.out.println(responseDO.toString());
    }

    @Test
    public void test2() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("liubei");
        user.setEmail("liubei@qq.com");
        user.setPassword("liubeiPassword");
        users.add(user);
        ResponseDO responseDO = new ResponseDO(true, "Success", users);
        System.out.println(responseDO.toString());
    }
}