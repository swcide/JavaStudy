package com.javaStudy.AbstractAndInterface_01.model.vo;

// 멤버로 추상메소드를 가지는 경우에는 class 앞에 반드시 abstract 키워드를 표시 해야한다.
// 추상클래스는 미완성된 클래스를 말하며, 미완성된 메소드는 반드시 상속을 받아 후손이 완성을 해야한다.
//추상클래스는 객체를 생성하지 못한다




public abstract class Product {

	//추상 클래스에도 생성자를 작성할 수 있다.
	public Product() {

	}

	//추상 메소드(미완성된 메소드) : 메소드 헤드만 있고 바디는 없는 메소드
	public abstract void abstMethod();


	public void printProduct() {
		System.out.println("Product 클래스의 printProduct() 메소드 실행");


	}

	@Override
	public String toString() {
		return "Product 의 toString() 메소드 실행";
	}


}
