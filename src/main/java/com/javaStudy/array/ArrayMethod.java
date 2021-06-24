package com.javaStudy.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethod {

    /*
    배열의 복사
    자바에서 배열은 한 번 생성하면 그 길이를 변경할 수 없습니다.
    따라서 더 많은 데이터를 저장하기 위해서는 더욱 큰 배열을 만들고, 이전 배열의 데이터를 새로 만든 배열로 복사해야 합니다.
    이러한 배열의 복사를 위해 자바에서는 다음과 같이 여러 가지 방법을 제공합니다.

    1. System 클래스의 arraycopy() 메소드
    2. Arrays 클래스의 copyOf() 메소드
    3. Object 클래스의 clone() 메소드
    4. for 문과 인덱스를 이용한 복사

    이 중에서 가장 좋은 성능을 보이는 것은 배열의 복사만을 위해 만들어진 arraycopy() 메소드입니다.
    하지만 현재 배열의 복사를 위해 가장 많이 사용되는 메소드는 좀 더 유연한 방식의 copyOf() 메소드입니다.
     */

    public static void main(String[] args) {

        int[] arr1 = new int[]{5, 3, 1, 2, 4};

        int newLen = 10;


    // 1. System 클래스의 arraycopy() 메소드
        int[] arr2 = new int[newLen];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

    // 2. Arrays 클래스의 copyOf() 메소드
        int[] arr3 = Arrays.copyOf(arr1, 10);

    // 3. Object 클래스의 clone() 메소드
        int[] arr4 = (int[]) arr1.clone();

    // 4. for 문과 인덱스를 이용한 복사
        int[] arr5 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr5[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

//      배열의 정렬!!!
//      Sort(array) :
//      Sort()를 하면 오름차순 정렬이 된다.

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String sArr [] = {"d","a","c","b"};

        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));

//        Sort() 두번째 : Sort(array, Comparator)
//        Collections.reverseOrder() 라는 메소드가 있는데, sort의 첫번째 파라미터에 문자형 배열을 담고 두번째 파라미터에 Collections.reverseOrder() 를 담으면 문자형 배열을 내림차순 정렬해준다.
//


        Arrays.sort(sArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(sArr));
//
//[d, c, b, a]
//
//        정수를 문자형으로 담아서 위와 같은 방식으로 정렬해도 작동하기는 한다.
//
//                String[] cc = {"11","12","13","23","53","223","145","53"};
//
//        다만 숫자 자체를 인식하는 것이 아니다보니 크기에 상관없이 무조건 첫번째 자리를 기준으로 내림차순 정렬해버린다.
//        자리수가 모두 같은 정수들을 내림차순으로 쉽게 정렬하고 싶다면 이 방법도 좋겠다.
//
//                Arrays.sort(cc, Collections.reverseOrder());
//        System.out.println(Arrays.toString(cc));
//
//[53, 53, 23, 223, 145, 13, 12, 11]
//
//        맨 앞자리 숫자만 따져 내림차순 정렬해버린 것을 볼 수 있다.
//
//
////        Sort() 세번째 : Sort(array, int fromindex, int toindex)​
////        인덱스의 시작과 끝을 정해 fromindex부터 toindex-1까지만 오름차순 정렬할 수도 있다.
////
//                Arrays.sort(b,4,14);
//        System.out.println(Arrays.toString(b));
//
//[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323]
//
////        1,5,5,7은 그대로 두고 4인덱스부터 정렬이 시작된 것을 볼 수 있다.
////
////                Sort() 네번째 : Sort(array, int fromindex, int toindex, Comparator)
////        두번째와 세번째를 조합할 수도 있다!
//
//                Arrays.sort(a); //{a,b,c,d}로 재정렬
//        Arrays.sort(a, 2,4,Collections.reverseOrder());
//        System.out.println(Arrays.toString(a));
//
//[a, b, d, c]
//
//        마찬가지로 a와 b는 그대로 두고 그 뒤부터 내림차순 정렬된 것을 확인할 수 있다.
    }


}
