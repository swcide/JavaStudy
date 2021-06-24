package com.javaStudy.AbstractAndInterface.run;


import com.javaStudy.AbstractAndInterface.model.vo.Baby;
import com.javaStudy.AbstractAndInterface.model.vo.Basic;
import com.javaStudy.AbstractAndInterface.model.vo.Family;
import com.javaStudy.AbstractAndInterface.model.vo.Mother;

public class Run {
	public static void main(String[] args) {

		// Family, Mother, Baby
		// 추상클래스는 생성이 안된다
//		Family f = new Family(); // 추상클래스이기 때문에 혼자서 객체 생성 불가. 미완성 클래스

		Family f1;
		Family f2; // 클래스 타입 레퍼런스로는 ㅅ ㅏ용 가능.

		// 다형성 적용
		f1 = new Mother("유엄마",50,70,"출산");
		f2 = new Baby("유아기", 3.5,70);
		System.out.println(f1);
		System.out.println(f2); // 복사 컨트롤 + 알트 + 방향키 위 아래
//
//		// 저녁이에요
//		f1.eat();
//		f2.eat();
//
//		f1.sleep();
//		f2.sleep();
//
//		System.out.println("==== 다음날 ====");
//		System.out.println(f1);
//		System.out.println(f2);
//
//		f1.overridTest(); // Mother 클래스는 Family의 overrideTest메소드를 오버라이딩 하지 않은 상태라 Famliy 출력
//		f2.overridTest(); // Baby 클래스는 Family의 overrideTest메소드를 오버라이딩 했기 때문에  baby 출력

		//2. 인터페이스를 이용.
//		Basic b = new Basic() ; // 인터페이스도 객체 생성 안됨.
		Basic b1 = new Mother("유엄마",50,70,"출산");
		Basic b2 = new Baby("유아기", 3.5,70);
		System.out.println(b1);
		System.out.println(b2);

		// 저녁이에요
		b1.eat();
		b2.eat();

		b1.sleep();
		b2.sleep();

		System.out.println("==== 다음날 ====");
		System.out.println(b1);
		System.out.println(b2);
//		다운 캐스팅
		((Mother)b1).overridTest();
		((Baby)b2).overridTest();
	}

}
