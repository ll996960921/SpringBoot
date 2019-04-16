package com.smilexl.dao;

import com.smilexl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: userDao
 * @Description: //TODO
 * @Author: LL
 * @Date: 2019/4/11 11:30
 * @Version: V1.0
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
