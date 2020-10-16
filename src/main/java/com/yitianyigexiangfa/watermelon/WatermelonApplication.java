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
}
