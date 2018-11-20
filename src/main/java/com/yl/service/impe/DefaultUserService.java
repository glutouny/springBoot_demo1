package com.yl.service.impe;

import com.yl.pojo.User;
import com.yl.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 杨黎
 * @Title   DefaultUserService
 * @description
 * @DATE 2018/11/9  13:31
 */
@Service
public class DefaultUserService implements UserService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(User user) {
        jdbcTemplate.update("insert into USER(ID, UserName, PASSWORD,AGE,PHONE) values(?, ?, ?, ?, ?)", user.getId(),user.getUserName(), user.getPassword(),user.getAge(),user.getPhone());
    }

    @Override
    public void deleteUserByUsername(Long id) {
        jdbcTemplate.update("delete from USER where ID = ?", id);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
    }
}
