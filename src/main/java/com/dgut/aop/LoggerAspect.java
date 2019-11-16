package com.dgut.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(public int com.dgut.utils.impl.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法的参数是"+args);
    }

//    @After("execution(public int com.dgut.utils.impl.CalImpl.*(..))")
////    public void after(JoinPoint joinPoint){
////        String name = joinPoint.getSignature().getName();
////    }

    @AfterReturning(value = "execution(public int com.dgut.utils.impl.CalImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"执行结果是"+result);
    }
}
