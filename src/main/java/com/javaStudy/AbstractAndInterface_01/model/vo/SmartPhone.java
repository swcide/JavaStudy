package com.javaStudy.AbstractAndInterface_01.model.vo;

public class SmartPhone extends Product{

	public SmartPhone() {

	}
	public void printSmartPhone() {
		System.out.println("SmartPhone 클래스 printSmartPhone()메소드 실행");
	}

	@Override
	public String toString() {
		return "SmartPhone 클래스의 toString()메소드 실행";
	}











	//	상속받은 부모의 추상메소드는 반드시 오버라이딩 해야 된다.
	@Override
	public void abstMethod() {
		// TODO Auto-generated method stub

	}

}
