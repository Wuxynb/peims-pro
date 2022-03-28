package com.example.peims.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerCut {
    private final Logger logger = LoggerFactory.getLogger(LoggerCut.class);

    @Pointcut(value = "execution(* com.example.peims.service..*.*(..))")
    public void pointcut() {

    }

    @Before(value = "pointcut()")
    public void before() {
        logger.info("Service layer a method is being executed.");
    }
}
