package com.javaStudy.Polymorphism.model.vo;

public class Child1 extends Parent{
	private int z;

	public Child1() {
		super();
	}


	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}


	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println(" Hi im 첫번째 자식입니다!");
	}



	@Override
	public void print() {
		System.out.println("나 첫번째 자식이야.");
	}




}

