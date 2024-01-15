package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
//    public void testSimpleIfElseIfStatement() {
//
//        /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("산 속에서 나무를 하면 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
//        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
//        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
//
//        System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
//
//        int answer = sc.nextInt();
//
//        if (answer == 1) {
//            System.out.println("거짓말");
//        } else if (answer == 2) {
//            System.out.println("적당한 거짓말");
//        } else {
//            System.out.println("훌륭");
//        }
//        System.out.println("동화 끝");
//    }

    public void testNestedIfElseIfStatement() {

        /* 필기.
         *  ohgiraffers 대학의 김XX 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 마지막으로 60점 미만인 경우에는
         *  'F'를 학점으로 주게 된다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         *  (추가로, 각 등급의 중간점수 (95, 85, 75..) 이상인 경우 '+'를 붙여서 등급을 세분화 해보자.)
         *
         *  필기.
         *   출력 예시 : XXX 학생의 점수는  86점이고, 등급은 B+입니다.
         *             프로그램을 종료합니다.
         * */
        /* 수업목표. if-else-if문 중첩 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하시오 : ");
        String name = sc.next();
        System.out.print("점수를 입력하시오 : ");
        int point = sc.nextInt();

        if (point > 100 && point < 0) {
            if (point >= 90) {
                if (point >= 95) {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 A+입니다");
                } else {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 A입니다");
                }
            } else if (point >= 80) {
                if (point >= 85) {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 B+입니다");
                } else {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 B입니다");
                }
            } else if (point >= 70) {
                if (point >= 75) {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 C+입니다");
                } else {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 C입니다");
                }
            } else if (point >= 60) {
                if (point >= 65) {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 D+입니다");
                } else {
                    System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 D입니다");
                }
            } else {
                System.out.println(name + " 학생의 점수는 " + point + "점이고 등급은 F입니다");
            }
        } else {
            System.out.println("값을 다시 입력하시오");
        }
    }
}
