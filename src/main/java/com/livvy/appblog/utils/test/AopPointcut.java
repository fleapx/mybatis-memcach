package com.livvy.appblog.utils.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-19
 * Time: 下午1:54
 * To change this template use File | Settings | File Templates.
 */
@Component
@Aspect
public class AopPointcut {

   @Pointcut("execution(* com.livvy.appblog.test.*.*(..))")
   public  void testPointCut(){

   }
}
