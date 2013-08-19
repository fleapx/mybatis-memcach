package com.livvy.appblog.mapper;

import com.livvy.appblog.bean.User;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-16
 * Time: 下午12:10
 * To change this template use File | Settings | File Templates.
 */
public interface UserMapper {
      User getByUserId(int id);
}
