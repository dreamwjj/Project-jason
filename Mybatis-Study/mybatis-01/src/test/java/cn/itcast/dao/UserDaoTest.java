package cn.itcast.dao;

import cn.itcast.pojo.User;
import cn.itcast.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test01(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.getUserById(6);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test02(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.addUser(new User
                (1, 123456, "wqp", "ly", "男",
                        8, "江苏", "1361274404", "123321@qq.com"));
        if (i>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test03(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.updateUser(new User
                (1, 123456, "wjj", "wjj", "男",
                        8, "江苏", "1361274404", "123321@qq.com"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test04(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(1);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test05(){
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",1);
        map.put("username","wjj");
        map.put("password",123456);
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }
}
