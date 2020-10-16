package com.yitianyigexiangfa.watermelon.mapper;

import com.yitianyigexiangfa.watermelon.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, email, password) VALUES(#{name}, #{email}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    @Select("SELECT id, name, email, password FROM user WHERE id = #{id}")
    User findById(long id);
}
