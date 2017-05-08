package service;

import dao.UserDao;
import domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Lin on 2017/5/8.
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User findUserById(int id){
        return userDao.findUserById(id);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public User findUserByNmAndPwd(String userName,String pwd){
        return userDao.findUserByNmAndPwd(userName,pwd);
    }
}
