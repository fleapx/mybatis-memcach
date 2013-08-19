package com.livvy.appblog.utils.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-19
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
@Aspect
@Component
public class AopAdvice {
    @Before("com.livvy.appblog.utils.test.AopPointcut.testPointCut()")
    public void doBefore(){
        System.out.println("start");
    }
}
