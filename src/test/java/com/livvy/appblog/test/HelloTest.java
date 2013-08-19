package com.livvy.appblog.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-13
 * Time: 下午3:56
 * To change this template use File | Settings | File Templates.
 */
public class HelloTest {
    @Test
    public void testSayHello() {
        Hello h = new Hello();
        String res = h.sayHello();
        assertEquals("hello world", res);
    }
}
