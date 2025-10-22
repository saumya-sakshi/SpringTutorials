package com.somyu.SpringBootRest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);
    @Around("execution(*  com.somyu.SpringBootRest.service.JobService.getJob(..)) && args(i)")
    public Object validateInput(ProceedingJoinPoint pjp, int i) throws Throwable {

       if(i < 0){
           LOGGER.warn("postId is negative, updating it");
           i = -i;
       }

        Object obj = pjp.proceed(new Object[]{i});


        LOGGER.info("input was validated" + i);
        return obj;

    }
}
