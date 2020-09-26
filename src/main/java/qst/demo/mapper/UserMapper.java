package qst.demo.mapper;

import org.apache.ibatis.annotations.*;
import qst.demo.dao.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user values(#{user_id},#{user_name})")
    void insert(User user);


    @Delete("delete user where user_id=#{user_id}")
    void delete(String user_id);


    @Update("update user set user_name=#{user_name} where user_id=#{user_id}")
    void modify(User user);


    @Select("select* from user")
    List<User>getUserList();
}
