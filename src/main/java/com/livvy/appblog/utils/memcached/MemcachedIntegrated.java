package com.livvy.appblog.utils.memcached;

import com.danga.MemCached.MemCachedClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-17
 * Time: 下午6:04
 * To change this template use File | Settings | File Templates.
 */
public class MemcachedIntegrated {

    @Autowired
    private MemCachedClient mcc;
    private static Log log = LogFactory.getLog(MemcachedIntegrated.class);

    public Object doAround(ProceedingJoinPoint jp) {
        Object result = null;
        String key = "";
        StringBuffer sb = new StringBuffer();
        sb.append(jp.getSignature().getName());
        //Key的规则这块，还不完善，如果查询参数传入的是一个对象的时候，就没用了
        for (Object obj : jp.getArgs()) {
            if (obj !=null)
                sb.append(obj);
        }
        key = sb.toString().replace(" ", "");
        result = mcc.get(key);
        log.info("add key : " +key);
        if (result != null) {
            log.info("Get cached object:" + key);
            return result;
        }
        try {
            result = jp.proceed(jp.getArgs());
        } catch (Throwable e) {
        }
        if (result !=null)
            mcc.set(key, result, 3600);
        return result;

    }

}