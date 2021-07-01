package com.javaStudy.Polymorphism_01.model.vo;

public class Tablet extends Electronic{
	private boolean penFalg;

	public Tablet() {
		
	}

	public Tablet(String brand, String name, int price, boolean penFalg) {
		super(brand, name, price);
		this.penFalg = penFalg;
	}

	public boolean isPenFalg() {
		return penFalg;
	}

	public void setPenFalg(boolean penFalg) {
		this.penFalg = penFalg;
	}

	@Override
	public String toString() {
		return super.toString() + "penFalg=" + penFalg ;
	}
	
	
	
}
