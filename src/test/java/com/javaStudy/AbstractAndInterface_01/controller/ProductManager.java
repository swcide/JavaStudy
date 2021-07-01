package com.javaStudy.AbstractAndInterface_01.controller;


import com.javaStudy.AbstractAndInterface_01.model.vo.Gallaxy;
import com.javaStudy.AbstractAndInterface_01.model.vo.Product;
import com.javaStudy.AbstractAndInterface_01.model.vo.SmartPhone;

public class ProductManager {

	public void testPolymorphism() {
		//다형성 (Polymorphism)
		//상속관계에 있는 클래스일 때 부모클래스형 레퍼런스가 후손 객체의 주소를 기록 저장할 수 있다.

//		Product p = new Product(); // 추상클래스는 객체 생성을 하지 못하고 , 상속받은 클래스로 구현 해야 한다.

		Product p1 = new SmartPhone();
		Product p2 = new Gallaxy();

		System.out.println(p1);
		System.out.println(p2);


		//모든 클래스의 조상은 Object
		//부모 클래스 타입으로 자식 객체의 주소를 받을 수 있다.
		Object obj = p1;
		Object obj2 = p2;

		//자식클래스의 메소드를 호출하기 위해 부모 레퍼런스를 자식 레퍼런스로 형변환 할 수 있다.
		SmartPhone s1 = new Gallaxy();
		s1.printProduct();
		s1.printSmartPhone();

		((Gallaxy)s1).printGallaxy();


		print(new Gallaxy());
	}

	public void print(Object obj) {
		// 부모 레퍼런스가 후손 객체의 주소를 받는 과정에서 자동으로 클래스 변환이 발생한다(up casting)
		// => 부모클래스가 가진 멤버만 참조할 수 있게 된다.
		// => 후손클래스가 가진 멤버는 참조할 수 없다.

		System.out.println("===== instanceof한 결과 =====");
//		if(obj instanceof Gallaxy) {
//		((Gallaxy)obj).printSmartPhone();
//		}
//		if(obj instanceof SmartPhone) {
//			((SmartPhone)obj).printSmartPhone();
//		}
//		if(obj instanceof Product) {
//			((Product)obj).printProduct();
//		}



		if(obj instanceof Gallaxy) {
			((Gallaxy)obj).printSmartPhone();
		}else if(obj instanceof SmartPhone) {
			((SmartPhone)obj).printSmartPhone();
		}else if (obj instanceof Product) {
			((Product)obj).printProduct();
		}

	}

	public void objectArrayTest() {
		Object[] arr = new Object[10];


		arr[0] = new String ("문자열 객체");
		arr[1] = new java.util.Date();
//		arr[2] = new Product(); // 추상클래스는 객체 생성불가
		arr[3] = new Gallaxy();
		arr[4] = new SmartPhone();

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Gallaxy) {
				((Gallaxy)arr[i]).printGallaxy();
			}else if(arr[i] instanceof SmartPhone) {
				((SmartPhone)arr[i]).printSmartPhone();
			}else if (arr[i] instanceof Product) {
				((Product)arr[i]).printProduct();
			}
		}

	}


}
