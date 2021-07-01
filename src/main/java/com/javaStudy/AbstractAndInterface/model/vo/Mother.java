package com.javaStudy.AbstractAndInterface.model.vo;

public class Mother extends Family implements Basic {

	private String babyBirth; // 아이의 탄생 :
	
	
	
	
	public Mother() {
		
	}
	
	

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}



	public String getBabyBirth() {
		return babyBirth;
	}



	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return super.toString() + "babyBirth=" + babyBirth ;
	}





	@Override
	public void eat() {
		super.setWeight(super.getWeight() +10); // 먹기때문에 몸무게 10 증가
		super.setHealth(super.getHealth() -5); // 먹기때문에 당뇨 .. 건강 5 감소

	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() +10 ); // 자기 때문에 건강 10증가

	}




	
}
