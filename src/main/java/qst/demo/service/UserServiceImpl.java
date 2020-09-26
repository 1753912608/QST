package qst.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qst.demo.dao.User;
import qst.demo.mapper.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public String insert(User user) {
        StringBuffer buffer=new StringBuffer("");
        try{
            userMapper.insert(user);
            buffer.append("新增用户成功user_id:"+user.getUser_id()+" user_name:"+user.getUser_name());
        }catch (Exception e){
            buffer.append("新增用户失败,异常信息:"+e.getCause());
            e.printStackTrace();
        }
        return buffer.toString();
    }

    @Override
    public String delete(String user_id) {
        StringBuffer buffer=new StringBuffer("");
        try{
            userMapper.delete(user_id);
            buffer.append("删除用户成功:user_id"+user_id);
        }catch (Exception e){
            buffer.append("删除用户失败,异常信息:"+e.getCause());
            e.printStackTrace();
        }
        return buffer.toString();
    }

    @Override
    public String modify(User user) {
        StringBuffer buffer=new StringBuffer("");
        try{
            userMapper.modify(user);
            buffer.append("修改用户信息成功,user_id:"+user.getUser_id()+",user_name:"+user.getUser_name());
        }catch (Exception e){
            buffer.append("修改用户信息失败,异常信息为:"+e.getCause());
            e.printStackTrace();
        }
        return buffer.toString();
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
