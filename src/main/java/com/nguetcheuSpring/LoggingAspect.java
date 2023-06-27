package com.nguetcheuSpring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution( * com.nguetcheuSpring.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        // System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: "+arg);
    }

    @After("execution(* com.nguetcheuSpring.ShoppingCart.checkout(..))")
    public void afterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* com.nguetcheuSpring.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning : "+retVal);
    }
}
