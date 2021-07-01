package com.javaStudy.Polymorphism.model.run;

import com.javaStudy.Polymorphism.model.vo.Child1;
import com.javaStudy.Polymorphism.model.vo.Child2;
import com.javaStudy.Polymorphism.model.vo.Parent;


public class Run {
	public static void main(String[] args) {
//		1. 부모 타입 레퍼런스로 부모 객체를 다룰 때 --> p1레퍼런스로 Parent 에만 접근 가능
		System.out.println("== 1. 부모타입 레퍼런스로 부모 객체 다루는 경우 == ");
		Parent p1 = new Parent();
		p1.printParent();

//		2. 자식 타입 레퍼런스로 자식 객체를 다룰 떄
		System.out.println("== 2. 자식 타입 레퍼런스로 부모 객체 다루는 경우 ==");
		Child1 c1 = new Child1();
		((Parent)c1).printParent();// 업 캐스팅 : 자식타입 --> 부모타입(생략가능)
		c1.printParent();
		c1.printChild1();

//		3. 부모타입 레퍼런스로 자식 객체를 다룰 떄
		System.out.println("== 3. 부모타입 레퍼런스로 자식 객체를 다루는 경우 ==");
		Parent p2 = new Child2(); // 업 캐스팅 : 자식타입이 --> 부모타입
		p2.printParent();
		((Child2)p2).printChild2();


//		4. 자식타입 레퍼런스로 부모 객체를 다룰 떄
//		Child2 c2 = (Child2)(new Parent()); //
//		System.out.println(c2); // 런타임 에러 : 컴파일 에러는 없지만 프로그램 실행 할 때 형변환 관련 예외가 발생(ClassCastException)


		System.out.println("=== 간단한 예제 ===");
//		다향성의 정의는 '부모 타입으로부터 파생된 여러가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술' 이다
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();

//		pArr 전체 출력
		for (int i = 0; i < pArr.length; i++) {
//			intanceof : 현재 참조형 변수가 어떤 클래스 형의 객체 주소를 참조하고 있는지 확인 할 떄 사용 한다.
//			클래스 타입이 일치하면 (true) 불일치하면 false -->> 조건식
//			if(pArr[i] instanceof Child1) {
//				((Child1)pArr[i]).printChild1();
//			}else if(pArr[i] instanceof Child2) {
//				((Child2)pArr[i]).printChild2();
//			}


			pArr[i].print();

			//동적바인딩 : 프로그램이 실행되기 전에 컴파일이 되면서 모든 메소드는 정적 바인딩이 되는데
//						   컴파일 시 정적바인ㄷ된 메소드를 실행할 당시의 객체 타입을 기준으로 바인되는 것을 동적 바인딩이라고 한다.
//						   상속관계로 이루어져 있는 다형성이 적용된 경우, 메소드 오버라이딩이 되어 있으면
//						   정적 바인딩 된 메소드 코드보다 오버라이딩 된 메소드를 우선으로 실행.
		}
	}
}
