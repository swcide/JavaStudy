package com.javaStudy.encapsulation.model;

public class Person{
    String name;
    String age;

    public Person() {
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void talk (){
        System.out.println("안녕 나는"+name+"이야");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}