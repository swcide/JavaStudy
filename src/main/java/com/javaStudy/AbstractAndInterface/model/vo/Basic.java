package com.javaStudy.AbstractAndInterface.model.vo;

public interface Basic {

	// 인터페이스 에서의 필드는 항상 상수 필드이다.
	/*public static final*/ double PI =3.14;

	// 인터페이스 에서의 메소드는 항상 추상 메소드 이다
	public abstract void eat() ;

	/* public abstract */void sleep() ;

}