package com.javaStudy.Polymorphism.model.vo;

public class Child2 extends Parent{
	private int n;

	public Child2() {
		super();
	}

	public Child2(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}

	public void printChild2() {
		System.out.println(" hi im 	second love story");
		
	}


	
	
	
	
}
