//중간점검 Chpater .1, Repository Pattern 의 직접 구현
package com.example.petshop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect

public class HomeAdvice {
    static int pageView = 0;
    public static int getPageView() {
        return ++pageView;
    }

    @After("execution(* com.example.petshop.PetshopApplication.*.*(..))")

    public void after() {
        System.out.println("--- page view : " + (++pageView));
    }
}
