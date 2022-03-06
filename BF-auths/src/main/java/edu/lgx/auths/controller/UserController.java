package edu.lgx.auths.controller;

import bzu.lgx.commons.Result;
import bzu.lgx.commons.StatusCode;
import edu.lgx.auths.entity.User;
import edu.lgx.auths.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 20:12
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PreAuthorize("hasAuthority('user:list')")
    @GetMapping(value="/findAll")
    public Result findAll() {
        return new Result(true, StatusCode.SUCCESS, "SUCCESS");
    }

}
