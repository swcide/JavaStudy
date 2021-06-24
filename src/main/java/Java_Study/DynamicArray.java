package Java_Study;

import java.util.Arrays;

public class DynamicArray {

    /*
    가변 배열(dynamic array)
    자바에서는 2차원 배열을 생성할 때 열의 길이를 명시하지 않음으로써, 행마다 다른 길이의 배열을 요소로 저장할 수 있습니다.

    이렇게 행마다 다른 길이의 배열을 저장할 수 있는 배열을 가변 배열(dynamic array)이라고 합니다.
     */


    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[2];

        arr[1] = new int[4];

        arr[2] = new int[1];
        System.out.println(Arrays.deepToString(arr));
//    위의 예제처럼 배열을 생성할 때 두 번째 첨자를 생략하면 가변 배열을 만들 수 있습니다.
//    또한, 가변 배열도 초기화 블록을 사용하여 배열을 선언과 동시에 초기화할 수 있습니다.

        //초기화
        arr = new int[][] {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };
        // 선언과 동시에 초기화
        int [][] arr2  = {
                {10, 120},
                {10, 201, 30, 40},
                {10}
        };

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr2));


    }
}
