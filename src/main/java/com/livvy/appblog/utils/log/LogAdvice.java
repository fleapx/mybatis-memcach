package com.livvy.appblog.utils.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-19
 * Time: 下午4:05
 * To change this template use File | Settings | File Templates.
 */
@Component
@Aspect
public class LogAdvice {
//    Log log = LogFactory.getLog(getClass());
    @Around("com.livvy.appblog.utils.log.LogPointCut.serviceLog()")
    public Object addLogForService(ProceedingJoinPoint jp) throws Throwable {
        Log log = LogFactory.getLog(jp.getTarget().getClass());
        log.info("开始执行");
        Object o = jp.proceed();
        log.info("执行结束");
        return o;
    }
}
