package com.nguetcheuSpring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com.nguetcheuSpring..*)")
    public void authenticatedPointCut() {

    }

    @Pointcut("within(com.nguetcheuSpring.*)")
    public void authorizationPointCut() {

    }

    @Before("authenticatedPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the request");
    }
}
