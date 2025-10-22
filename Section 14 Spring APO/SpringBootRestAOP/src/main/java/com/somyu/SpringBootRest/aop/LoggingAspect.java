package com.somyu.SpringBootRest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    //return type, fully qualified class name, method name, args
    @Before("execution(*  com.somyu.SpringBootRest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){

        LOGGER.info("method called "+ jp.getSignature().getName());

    }

    //return type, fully qualified class name, method name, args
    @After("execution(*  com.somyu.SpringBootRest.service.JobService.getJob(..)) || execution(*  com.somyu.SpringBootRest.service.JobService.update(..))")
    public void logMethodExecuted(JoinPoint jp){

        LOGGER.info("method Executed "+ jp.getSignature().getName());

    }

    @AfterThrowing("execution(*  com.somyu.SpringBootRest.service.JobService.getJob(..)) || execution(*  com.somyu.SpringBootRest.service.JobService.update(..))")
    public void logMethodExecutedEror(JoinPoint jp){

        LOGGER.info("method gave error "+ jp.getSignature().getName());

    }

    @AfterReturning("execution(*  com.somyu.SpringBootRest.service.JobService.getJob(..)) || execution(*  com.somyu.SpringBootRest.service.JobService.update(..))")
    public void logMethodAfterReturn(JoinPoint jp){

        LOGGER.info("method was success "+ jp.getSignature().getName());

    }
}
