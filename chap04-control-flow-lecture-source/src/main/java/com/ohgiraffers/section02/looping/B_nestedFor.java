package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단수의 곱");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화 해보자. */
        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "수 출력");
            printGugudanof(dan);
            System.out.println();
        }
    }

    /* 설명. 단수를 넘기면 1~9까지 곱해서 숫자를 출력해주는 기능 */
    private void printGugudanof(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + "*" + su + "=" + (dan * su));
        }
    }

    /* 설명.
     *  아래와 같은 별모양이 나오도록 작성해보자
     *  정수를 입력하시오 : 5
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     * */
//    public void printStars() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하시오 : ");
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= num; i++) {
////            for (int j = 1; j <= num - i; j++) {
////                System.out.print(" ");
////            }
//            printSpace(num, i);
//
////            for (int j = 1; j <= i; j++) {
////                System.out.print("*");
////            }
//            printStar(i);
//            System.out.println();
//        }
//    }
//
//    private void printStar(int i) {
//
//    }
//
//    private void printSpace(int num, int i) {
//        for (int j = 1; j <= num - i; j++) {
////                System.out.print(" ");
////                }
//        }
//
////        private void printStar(int j){
////            for (int j = 1; j <= i; j++) {
////                System.out.print("*");
////            }
//            }
//        }
    }
//}

