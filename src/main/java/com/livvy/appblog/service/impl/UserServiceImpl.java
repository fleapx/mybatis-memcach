package com.livvy.appblog.service.impl;

import com.livvy.appblog.bean.User;
import com.livvy.appblog.dao.UserDao;
import com.livvy.appblog.mapper.UserMapper;
import com.livvy.appblog.service.UserService;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-15
 * Time: 下午7:02
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public User getUserById(long id) {
//        return (User)sqlSessionTemplate.selectOne("com.livvy.appblog.mapper.UserMapper.getByUserId",id);
           return userDao.getByUserId(id);
    }
}
