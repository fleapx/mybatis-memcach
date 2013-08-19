package com.livvy.appblog.test;

import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-19
 * Time: 下午1:50
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class AopTest {

    public String getParams(){

        System.out.println("方法执行");

        return "zzz";
    }
}
