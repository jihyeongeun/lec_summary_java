package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
//    int hp;

    /* 설명. 필드의 변수명이 바뀌었다면 */      /* 단일책임의 원칙 - 에러는 나더라도 해당 클래서에서만 나야함 */
    String kinds;
    int mp;

    public void setInfo1(String info1) {
        this.kinds = info1;
    }

    public void setInfo2(int info2) {
        this.mp = info2;
    }
}
