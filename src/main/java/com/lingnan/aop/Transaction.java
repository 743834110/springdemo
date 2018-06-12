package com.lingnan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.aspectj.AspectJAroundAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/6/6.
 */

@Aspect
@Component
public class Transaction{

    @Before("execution(void com.lingnan.service.impl.BookServiceImpl.buyBooks())")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知" + joinPoint);
    }

    @After("execution(void com.lingnan.service.impl.BookServiceImpl.buyBooks())")
    public void after(JoinPoint joinPoint){
        System.out.println("最终通知" + joinPoint);
    }

    @AfterReturning(value = "execution(void com.lingnan.service.impl.BookServiceImpl.buyBooks())", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue){
        System.out.println("后置通知" + joinPoint);
    }
    @Around("execution(void com.lingnan.service.impl.BookServiceImpl.buyBooks())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("绕前通知" + proceedingJoinPoint);
        proceedingJoinPoint.proceed();
        System.out.println("绕后通知" + proceedingJoinPoint);
        int a = 1 / 0;
    }
    @AfterThrowing(value = "execution(void com.lingnan.service.impl.BookServiceImpl.buyBooks())", throwing = "e")
    public void exception(JoinPoint joinPoint, Exception e){
        System.out.println("异常通知" + joinPoint);
    }
}
