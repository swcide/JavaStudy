package com.javaStudy.Inheritance;

public class run {
    public static void main(String[] args) {


//        Car myCar1 = new Car(); // 기본 생성자의 호출 (기본생성자가 없을 시에 오류)

        Car myCar = new Car("아반떼", 2016, "흰색", 200); // 생성자의 호출



        System.out.println(myCar.getModel()); // 생성자에 의해 초기화되었는지를 확인함.


    }

    /*
    만약 매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 자동으로 추가되지 않습니다.
    따라서 매개변수를 가지는 생성자를 하나 이상 정의한 후 기본 생성자를 호출하면, 오류가 발생할 것입니다.

     */
}
