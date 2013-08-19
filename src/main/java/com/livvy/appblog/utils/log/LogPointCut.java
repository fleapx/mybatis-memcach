package com.livvy.appblog.utils.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-19
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
@Component
@Aspect
public class LogPointCut {

    @Pointcut("execution(* com.livvy.appblog.service.*.*(..)))")
    public void serviceLog(){
    }
}
