package com.javaStudy.AbstractAndInterface.model.vo;

public class Baby extends Family implements Basic {

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}


	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void eat() {
		super.setWeight(super.getWeight() +3 ); // 먹기 때문에 몸무게 3 증가
		super.setHealth(super.getHealth() + 1); //아기는 먹어야 하므로 건강 1증가
	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() +3 ); // 자기 때문에 건강도 3증가
	}


	// 상위 클래스의 추상 메소드가 아닌 이상 일반 메소드는 강제로 오버라이딩 할 필요가 없다.
	// 필요하면 그때 그때 추가하면 된다.

	@Override
	public void overridTest() {
		// TODO Auto-generated method stub
		System.out.println("Baby");
	}




}
