package com.example.authservice.dao;

import com.example.authservice.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: 庞洋洋
 * @Date: 2018/10/31 20:31
 * @Description:
 */
public interface UserDao extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
