package com.livvy.appblog.test;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-13
 * Time: 下午3:45
 * To change this template use File | Settings | File Templates.
 */
public class Hello {
    public String sayHello(){
        return "hello world";
    }

    public static void main(String[] args) {
        System.out.println(new Hello().sayHello());
    }
}
