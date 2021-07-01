package com.javaStudy.array;

import java.util.Arrays;

class Array {

    /*
    1차원 배열
    1차원 배열은 가장 기본적인 배열로 다음과 같은 문법에 따라 선언합니다.

    문법
    1. 타입[] 배열이름;

    2. 타입 배열이름[];


    배열의 초기화
    자바에서는 변수와 마찬가지로 배열도 선언과 동시에 초기화할 수 있습니다.
    다음과 같이 괄호({})를 사용하여 초깃값을 나열한 것을 초기화 블록(initialization block)이라고 합니다.
    자바에서는 이러한 초기화 블록을 이용하여 배열을 선언과 동시에 초기화할 수 있습니다.

    초기화 블록을 이용한 배열의 초기화 방법은 다음과 같습니다.

    문법
    1. 타입[] 배열이름 = {배열요소1, 배열요소2, ...};

    2. 타입[] 배열이름 = new 타입[]{배열요소1, 배열요소2, ...};
     */

    public static void main(String[] args) {
        int [] array1 = new int[101]; // 인트형 배열, 크기 지정.

        for (int i = 0; i <array1.length ; i++) {
            array1[i]=i;
        }

        for(int idx :array1){
            System.out.println(idx);


        }
        System.out.println(Arrays.toString(array1));


        int[] grade1 = {70, 90, 80};          // 배열의 선언과 동시에 초기화할 수 있음.

        int[] grade2 = new int[]{70, 90, 80}; // 배열의 선언과 동시에 초기화할 수 있음.

        int[] grade3;

        // grade3 = {70, 90, 80};             // 이미 선언된 배열을 이 방법으로 초기화하면 오류가 발생함.

        int[] grade4;

        grade4 = new int[]{70, 90, 80};       // 이미 선언된 배열은 이 방법으로만 초기화할 수 있음.
    }

}