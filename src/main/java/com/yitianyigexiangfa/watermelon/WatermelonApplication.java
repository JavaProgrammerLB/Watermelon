package com.yitianyigexiangfa.watermelon;

import com.yitianyigexiangfa.watermelon.entity.User;
import com.yitianyigexiangfa.watermelon.mapper.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WatermelonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatermelonApplication.class, args);
    }

    private final UserMapper userMapper;

    public WatermelonApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner(){
        return args -> {
            User user = new User();
            user.setName("liubei");
            user.setEmail("admin@yitianyigexiangfa.com");
            user.setPassword("liubeiPassword");
            userMapper.insert(user);
            System.out.println(userMapper.findById(user.getId()));
        };
    }
}
