package com.yitianyigexiangfa.watermelon.mapper;

import com.yitianyigexiangfa.watermelon.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, email, password) VALUES(#{name}, #{email}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    @Select("SELECT id, name, email, password FROM user WHERE id = #{id}")
    User findById(long id);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteById(long id);

    @Update("Update user set name = #{name}, email = #{email}, password = #{password} where id = #{id}")
    void update(User user);

    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT id, name, email, password FROM user WHERE email = #{email} and password = #{password}")
    User findByEmailAndPassword(String email, String password);

}
