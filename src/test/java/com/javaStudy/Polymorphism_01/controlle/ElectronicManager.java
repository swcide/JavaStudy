package com.javaStudy.Polymorphism_01.controlle;


import com.javaStudy.Polymorphism_01.model.vo.Desktop;
import com.javaStudy.Polymorphism_01.model.vo.Electronic;
import com.javaStudy.Polymorphism_01.model.vo.NoteBook;
import com.javaStudy.Polymorphism_01.model.vo.Tablet;

public class ElectronicManager {

//	용산 전자상가에 오신걸 환영합니다.

	// 1. 다형성 적용 안했을 때
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet tab = null;

	private Electronic[] elec = new Electronic[3];
	private int count = 0;

	public ElectronicManager() {

	}

	// 1. 다형성 적용 안했을 떄
	// insert(전달받은 주소값 대입) --> 오버로딩이 적용(매개변수를 다르게 사용 가능)

//	public void insert(Desktop desk) {
//		this.desk= desk;
//	}
//	public void insert(NoteBook note) {
//		this.note= note;
//	}
//	public void insert(Tablet tab) {
//		this.tab = tab;
//	}
//
//	// select(각각의 반환형에 해당하는 주소값 리턴) --> 오버로딩 적용 불가능(반환형은 오버로딩에 영향을 끼치지 않기 때문에)
//	public Desktop selectDesktop() {
//		return this.desk;
//	}
//	public NoteBook selectNoteBook() {
//		return this.note;
//	}
//	public Tablet selectTablet() {
//		return this.tab;
//	}

	// 2. 다형성 적용 했을 때
//	public void insert(Desktop desk) {
//		elec[0] = desk;
//	}
//	public void insert(NoteBook note) {
//		elec[1] = note;
//	}
//	public void insert(Tablet tab) {
//		elec[2] = tab;
//	}
	public void insert (Electronic any) {
		elec[count] = any;
		count++;
	}
//	public Desktop selectDesktop() {
//		return (Desktop)elec[0]; //다운캐스팅
//	}
//	public NoteBook selectNoteBook() {
//		return (NoteBook)elec[1];
//	}
//	public Tablet selectTablet() {
//		return (Tablet)elec[2];
//	}

	public Electronic select(int index) {

		return elec[index];
	}
	public Electronic[] select() {

		return elec;
	}
}
