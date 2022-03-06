package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUsr();
    }
}
