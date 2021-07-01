package com.javaStudy.AbstractAndInterface_01.model.vo;

public class Gallaxy extends SmartPhone {
	//추상클래스  -> 일반클래스 (추상메소드를 재정의) - > 일반클래스 최상위부모의 추상메소드는 제정의 할 필요가 없다

	public Gallaxy() {}



	//SmartPhone 클래스에서 Product의 추상메소드를 재정의 해놓앗기 때문에
	//SamrtPhone 클래스를 상송받아 사용하는 경우에는 반드시 오버라이딩 해야하는 부담이 없어진다.
	//하지만 SmartPhone 클래스에서 아무런 기능 없이 메소드 바디만 작성한 상태이기 때문에
	// 기능이 필요한 경우 오버라이딩하여 메소드 재작성 해야한다.

	public void printGallaxy() {
		System.out.println("Gallaxy 클래스의 printGallaxy() 메소드 실행");
	}

	@Override
	public String toString() {
		return "Gallaxy 클래스의 toString()메소드 실행";
	}



}
	