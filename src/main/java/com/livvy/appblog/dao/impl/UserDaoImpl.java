package com.livvy.appblog.dao.impl;

import com.livvy.appblog.bean.User;
import com.livvy.appblog.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-15
 * Time: 下午8:18
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getByUserId(long id) {

        final User user = new User();
        String sql = String.format("select * from users where id = %d", id);
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                user.setId(rs.getInt("id"));
                user.setDisplayName(rs.getString("display_name"));
            }
        });
        return user;
    }
}
