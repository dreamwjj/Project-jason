package cn.itcast.dao;

import cn.itcast.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //获取所有用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入用户
    int addUser(User user);
    //插入用户2
    int addUser2(Map<String,Object> usermap);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
