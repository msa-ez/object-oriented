// 중간점검 Chpater .1
// Repository Pattern 의 직접 구현 Chpater .1, Chpater .2
// JPA 를 기반한 Repository pattern 구현체 자동생성 Chpater .1
// restful api 란 Chapter .1, Chapter .2, Chapter .3, Chapter .4, Chapter .5, Chapter .6, Chapter .7
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
