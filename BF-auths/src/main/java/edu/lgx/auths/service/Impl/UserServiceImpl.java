package edu.lgx.auths.service.Impl;

import bzu.lgx.utils.IdWorker;
import edu.lgx.auths.dao.UserDao;
import edu.lgx.auths.entity.User;
import edu.lgx.auths.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 21:11
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String username) {
        User user = userDao.findUserByName(username);
        if(user != null) {
            return user;
        } else {
            return null;
        }
    }
}
