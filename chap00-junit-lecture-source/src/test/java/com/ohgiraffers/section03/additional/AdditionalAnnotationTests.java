package com.ohgiraffers.section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AdditionalAnnotationTests {

    /* 수업목표. Junit에서 제공하는 메소드 관련 추가 어노테이션을 사용할 수 있다. */

    /* 필기. 해당 테스트를 무시할 때 사용하는 어노테이션이다. */
    @Disabled
    @Test
    public void testIgnore(){

    }

    /* 설명. 주어진 시간안에 테스트가 끝나지 않으면 테스트가 실패한다. */
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeout() throws InterruptedException{
        Thread.sleep(900);
//        Thread.sleep(1001);       // 예외 발생(InterruptedException)
    }

    /* 설명. Order를 통해 원하는 순서대로 테스트를 진행할 수 있다. */
    @Test
    @Order(1)
    public void testFirst(){}

    @Test
    @Order(3)
    public void testThird(){}

    @Test
    @Order(2)
    public void testSecond(){}

    /* 설명. RepeatedTest를 통해 테스트를 원하는만큼 반복할 수 있다.(부하 테스트) */
    @RepeatedTest(10)
    public void testRepeat(){}
}
