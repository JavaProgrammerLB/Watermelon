package com.yitianyigexiangfa.watermelon.service;

import com.yitianyigexiangfa.watermelon.entity.User;
import com.yitianyigexiangfa.watermelon.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
        LOGGER.info("Insert user = {} Success", user);
    }

    public void delete(long id) {
        userMapper.deleteById(id);
        System.out.println("delete id = " + id);
        LOGGER.info("Delete id = {}", id);
    }

    public void update(User user) {
        userMapper.update(user);
        LOGGER.info("Update User to {}", user);
    }

    public User findById(long id) {
        User user = userMapper.findById(id);
        LOGGER.info("id = {}, 查询结果为： {}", id, user);
        return user;
    }

    public List<User> getAll() {
        List<User> users = userMapper.getAll();
        LOGGER.info("所有用户的列表为：{}", users);
        return users;
    }

}
