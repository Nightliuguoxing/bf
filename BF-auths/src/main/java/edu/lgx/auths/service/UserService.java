package edu.lgx.auths.service;

import edu.lgx.auths.entity.User;

import java.util.Set;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 20:43
 * @Description:
 */
public interface UserService {


    User findUserByName(String username);


}
