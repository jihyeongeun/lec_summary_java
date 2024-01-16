package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false;
    private int speed;

    public void startUp() {
        if (this.isOn) {             //시동이 걸려 있으면
            System.out.println("이미 시동이 걸려있어요");
        } else {                //시동이 걸려있지 않다면
            this.isOn = true;        //isOn 앞에는 this.이 있는거지만 this.를 생략해도 괜찮음
            System.out.println("시동을 걸었습니다. 부릉부릉!~");

        }
    }

    public void go() {
        if (isOn){          //시동이 켜져있어 달릴 수 있음
            System.out.println("차가 앞으로 움직입니다.");
            speed += 10;
            System.out.println("현재 차의 시속은 " + speed + "km/h입니다.");
        } else {            //꺼져있어 달릴 수 없음
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }
    }

    public void stop() {
        if(isOn){
            if (speed > 0){
                speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }
    }

    public void turnoff() {
        if (isOn){
            if (speed>0){
                System.out.println("달리는 중입니다. 시동을 끌 수 없습니다.");
            } else {
                isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.");
        }
    }
}