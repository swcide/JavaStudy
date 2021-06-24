package com.javaStudy.Inheritance;

public class Car {

    private String modelName;

    private int modelYear;

    private String color;

    private int maxSpeed;

    private int currentSpeed;

    public Car() {
    }

    Car(String modelName, int modelYear, String color, int maxSpeed) {

        this.modelName = modelName;

        this.modelYear = modelYear;

        this.color = color;

        this.maxSpeed = maxSpeed;

        this.currentSpeed = 0;

    }



    public String getModel() {

        return this.modelYear + "년식 " + this.modelName + " " + this.color;

    }

}


