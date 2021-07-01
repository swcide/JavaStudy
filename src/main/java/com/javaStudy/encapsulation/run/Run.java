package com.javaStudy.encapsulation.run;

import com.encapsulation.model.Account;

public class Run {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Account acc = new Account();
//		현재 잔액 조회;
        acc.dispalyBalance();

//		100만원 알바비.
        acc.deposit(1000000);
        acc.dispalyBalance();

//		추가로 150만원
        acc.deposit(1500000);
        acc.dispalyBalance();

//		출금
        acc.withdraw(500000);
        acc.dispalyBalance();                   //200만
        System.out.println(acc.getBalance());
//		acc.balance-= 1000000;// 누군지 모름
        acc.setBalance(2100000);               //210만
        System.out.println(acc.getBalance());
        acc.withdraw(1200000);
        acc.dispalyBalance();

    }
}
