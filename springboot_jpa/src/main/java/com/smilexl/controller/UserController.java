package com.smilexl.controller;

import com.smilexl.dao.UserDao;
import com.smilexl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: //TODO
 * @Author: LL
 * @Date: 2019/4/11 12:57
 * @Version: V1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")Integer id){
        return userDao.findById(id).get();
    }

    @GetMapping("/user")
    public User insertUser(User user){
        return userDao.save(user);
    }
}
