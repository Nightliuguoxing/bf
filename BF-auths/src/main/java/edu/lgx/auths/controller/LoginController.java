package edu.lgx.auths.controller;

import bzu.lgx.commons.Result;
import bzu.lgx.commons.StatusCode;
import edu.lgx.auths.entity.User;
import edu.lgx.auths.jwt.JwtAuthenticationToken;
import edu.lgx.auths.utils.SecurityUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 20:39
 * @Description:
 */
@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user, HttpServletRequest request){
        JwtAuthenticationToken token = SecurityUtils.login(request, user.getUsername(), user.getPassword(), authenticationManager);
        System.out.println("token = " + token);
        return new Result(true, StatusCode.SUCCESS, "登录成功", token);
    }

}
