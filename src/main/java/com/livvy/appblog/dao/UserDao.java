package com.livvy.appblog.dao;

import com.livvy.appblog.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-15
 * Time: 上午9:37
 * To change this template use File | Settings | File Templates.
 */

public interface UserDao {

    /**
     * 根据用户的Id查询用户信息
     * @param id   用户id
     * @return  用户实体类
     */
    User getByUserId(long id);
}
