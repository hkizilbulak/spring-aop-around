package com.hkizilbulak.springaoparound.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BankAspect {

    @Pointcut(value = "execution(* com.hkizilbulak.springaoparound.service.BankService.*(..))")
    public void displayLogBalance() {}

    @Around(value = "displayLogBalance()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around method before calling method : "+proceedingJoinPoint.getSignature());
        proceedingJoinPoint.proceed();
        System.out.println("Around method after calling method : "+proceedingJoinPoint.getSignature());
    }
}
