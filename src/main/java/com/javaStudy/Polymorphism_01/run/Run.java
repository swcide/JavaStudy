package com.javaStudy.Polymorphism_01.run;


import com.javaStudy.Polymorphism_01.controlle.ElectronicManager;
import com.javaStudy.Polymorphism_01.model.vo.Desktop;
import com.javaStudy.Polymorphism_01.model.vo.Electronic;
import com.javaStudy.Polymorphism_01.model.vo.NoteBook;
import com.javaStudy.Polymorphism_01.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {
		ElectronicManager em = new ElectronicManager();

		// 다형성 적용 안했을 때
		// 가게에 새로운 물건들을 들여놓기 위해서 insert 메소드 실행
		em.insert(new Desktop("Samsong","데탑",1200000,"intel","지포스1070"));
		em.insert(new NoteBook("LG","그램",1500000,"intel",3));
		em.insert(new Tablet("Apple","아이패드",800000,false));
//
//		System.out.println(em.selectDesktop());
//		System.out.println(em.selectNoteBook());
//		System.out.println(em.selectTablet());
////
//		System.out.println(em.select(0));
//		System.out.println(em.select(1));
//		System.out.println(em.select(2));
//
		Electronic[] elec = em.select();

		for(Electronic e : elec) {
			System.out.println(e);
			if(e instanceof Desktop) {
				System.out.println(((Desktop)e).getBrand());
			}else if (e instanceof NoteBook){
				System.out.println(((NoteBook)e).getUsbPort());
			}else if (e instanceof Tablet){
				System.out.println(((Tablet)e).getName());
			}
		}
	}

//
//    for(Electronic e : elec) {
//        System.out.println(e);
//        if(e instanceof Desktop) {
//           System.out.println(((Desktop)e).getBrand());
//        }else if (e instanceof NoteBook) {
//           System.out.println(((NoteBook)e).getUsbPort());
//        }else if ( e instanceof Tablet) {
//           System.out.println(((Tablet)e).getName());
//		}
//		}
//
//	}


}
