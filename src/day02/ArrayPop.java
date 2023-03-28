package day02;

import java.util.Arrays;

public class ArrayPop {

    public static int pop(){

        if (arr.length > 0) {
            //삭제 대상 데이터 백업
            int delTarget = arr[arr.length -1];

            int[] arrCopy = new int [arr.length - 1];

            for (int i = 0; i < arrCopy.length; i++) {
                arrCopy[i] = arr[i];

            }
            arr = arrCopy;
            arrCopy = null;

            return delTarget;
        }
        System.out.println("삭제 데이터 없음");
        return 0;
    }
    static int [] arr = {10, 20, 30, 40, 50};
        public static void main(String[] args) {

        pop();
        pop();
        pop();
        pop();
        pop();



        System.out.println(Arrays.toString(arr));


    }
}
