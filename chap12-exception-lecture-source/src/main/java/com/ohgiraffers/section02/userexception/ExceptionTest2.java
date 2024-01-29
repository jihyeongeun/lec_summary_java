package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnougthMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException{

        /* 설명. throw를 통합 예외 발생시 바로 메소드를 호출한 곳으로 에외 인스턴스와 함계 반봔된다. */
        if (price<0){
            throw new PriceNegativeException("상품가격은 음수일 수 없습니다.");
        }

        if (money < 0){
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if (money < price){
            throw new NotEnoughMoneyException("가진 돈보다 계산할 금액이 더 큽니다.");
        }
        System.out.println("결제가 완료되었습니다.");
    }

}
