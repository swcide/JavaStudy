package com.javaStudy.encapsulation.model;

public class Account
{
   /* 1. 객체지향언어 vs 절차지향 언어
		        객체          절차
	    2. 객체란?
	     - 사전적 의미로 독립적으로 존재하는 어떠 한 것들(무형,유형,사물,개념..)
	    3. 객체지향프로그래밍?
	     - 현실세계의 객체간의 상호작용(의미, 목적을 가지고) --> 프로그램을 통해 가상세계(메모리 영역)에 구현
	    4. 추상화 - 사물(객체)들이 가지는 공통적인 특징, 속성들을 추출한 후 ' 내가 구현하고자 하는 프로그램' 목적에
					맞춰 불필요한 것들을 제거하는 과정
		-  내가 어떤 프로그램을 만들지, 어떤 목적으로 쓸지에 대해서 잘 생각을 해야한다.
		5. 캡슐화_private(접근제한자)
		-  추상화를 통해 정의된 속성과 기능을 하나로 묶어 관리하는 기법
		-  클래스의 가장 중요한 목적인 데이터의 접근 제한을 원칙으로 하여 외부에서이 데이터 직접 접근을 막고,
		-  대신에 데이터를 처리하는 메소드들을 클래스 내부에 작성하여 데이터에 간접적으로 접근하는 방식을 말한다.
		5_1 캡슐화_ setter / getter

		6. 클래스 사용
		   클래스 == 여러개의 자료형, 여러개의 값을 저장할 수 있는 배열과 같은 것이라고 일단 생각하자 -> 자료형
		   new 연산자를 통해서 생성을 하고 해당 주소값을 참조형 변수에 담아서 사용

		   Student st = new Student();
		   1. st라고 하는 참조변수가 stack 메모리에 생성
		   2. new를 통해 실제값들이 들어갈 공간의 주소값을 가진채 heap메모리에 생긴다.
		   3. 대입연산자를 통해 st가 heap 공간의 주소를 가르킨다.(참조한다)
        */
//		입금 출금을 관리하는 프로그램
//		private 접근제한자 사용전
//
//	public String name  = "홍길동";
//	public String accno ="010-1111-2222";
//	public String paw 	= "1234";
//	public int bankcode = 20;
//	public int balance	= 0; //잔액

    private String name  = "홍길동";
    private String accNo ="010-1111-2222";
    private String pwd 	= "1234";
    private int bankCode = 20;
    private int balance	= 0; //잔액

//  기본생성자
//	일종의 메소드 -> 객체를 생산하기위한
    public Account() {}


//    입급을 위한 메소드
    public void deposit(int money) { // int 형이기 때문에 무조건 정수값만
        //0을 넣으면 의미없음, 오류
        if(money >0) {
            balance += money;
            System.out.println(name+"님의 계좌에"+money+"원이 입금되었습니다.");
        }else {
            System.out.println("잘못된 금액이 입력되었습니다.");
        }

    }

    //		출금을 위한 메소드
    public void withdraw (int money) {
        if(money<balance) {
            balance -= money;
            System.out.println(name+"님의 계좌에서"+money+"원이 출금 되었습니다.");
        }else {
            System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
        }
    }

    //		잔액조회를 위한 메소드
    public void dispalyBalance() {
        System.out.println(name+"님의 계좌 잔액은"+balance + " 원 입니다.");
    }

//	변수의 접근제한자를 public(어디서든지 접근이 가능하다) -> private(나자신(클래스 내부))
    public String getName() {
        return name;

    }

    public void setName(String name ) { //반환 값 없으므로 void
        this.name = name; //필드의 멤버 변수임을 나타내는 this
        name = "최민식";
    }

    //	accNo,pwd,bankcode,balance
    public String getAccNo() {
        return accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public int getBankCode() {
        return bankCode;
    }
    public void setBankCode(int bankCode) {
        this.bankCode =bankCode;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance =balance;
    }
}

