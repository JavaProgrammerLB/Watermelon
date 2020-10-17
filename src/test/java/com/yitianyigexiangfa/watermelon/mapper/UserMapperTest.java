package com.yitianyigexiangfa.watermelon.mapper;

import com.yitianyigexiangfa.watermelon.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setName("newOne");
        user.setEmail("newOne@yitianyigexiangfa.com");
        user.setPassword("newOnePassword");
        userMapper.insert(user);
        List<User> users = userMapper.getAll();
        User lastUser = users.get(users.size() - 1);
        assertEquals(lastUser.getName(), user.getName());
        assertEquals(lastUser.getEmail(), user.getEmail());
        assertEquals(lastUser.getPassword(), user.getPassword());
    }

    @Test
    public void findById() {
        User user = userMapper.findById(1);
        assertEquals("liubei", user.getName());
        assertEquals("admin@yitianyigexiangfa.com", user.getEmail());
        assertEquals("liubeiPassword", user.getPassword());
    }

    @Test
    public void deleteById() {
        userMapper.deleteById(3);
        List<User> users = userMapper.getAll();
        assertEquals(2, users.size());
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(2);
        user.setName("liubei2");
        user.setEmail("yitianyigexiangfa@yeah.net");
        user.setPassword("liubeiPassword2");
        userMapper.update(user);
        User user1 = userMapper.findById(2);
        assertEquals("liubei2", user1.getName());
        assertEquals("yitianyigexiangfa@yeah.net", user1.getEmail());
        assertEquals("liubeiPassword2", user1.getPassword());
    }

    @Test
    public void getAll() {
        List<User> users = userMapper.getAll();
        assertEquals(3, users.size());
    }
}