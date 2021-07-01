package com.javaStudy.AbstractAndInterface.model.vo;

public abstract class Family {
	private String name;
	private double weight;
	private int health;
	
	public Family() {
		
	}

	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}





	// 추상메소드 : 몸체 없는 메소드
	//추상 메소드 : [접근제한자] abstract 반환형 메소드명(자료형 변수명)
//	public abstract void eat();
//	
//	public abstract void sleep();
	
	public void overridTest() {
		System.out.println("Family");
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", health=" + health +" ";
	}
	
}
