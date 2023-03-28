package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIo {
    public static void main(String[] args) throws IOException {

        String dog = "멍멍이", cat = "야옹이";

        System.out.println(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni = "개천절";

        System.out.println(month + "월" + day + "일은 " + anni + "입니다");

//        souf %d: 정수 , %s : 문자열 , %f : 실수
        System.out.printf("%d월 %d일은 %s 입니다", month, day, anni);

        double rate = 25.4567;
        System.out.printf("오늘의 할인율을 %f 입니다.\n" , rate);
        System.out.printf("오늘의 할인율을 %.4f 입니다.\n" , rate);
        System.out.printf("오늘의 할인율을 %.8f 입니다.\n" , rate);
        System.out.printf("오늘의 할인율을 %.2f 입니다.\n" , rate);
        System.out.printf("오늘의 할인율을 %.1f%% 입니다.\n" , rate); // 특수문자 사용하려면 %%을 써줘야한다


        //표준 입력
        // int result = System.in.read();
        // ctrl alt v = 변수에 바로 담아다 줌
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int result = 0;
        try{
            //
            result = Integer.parseInt(str);
        }catch (Exception e){
            System.out.println("정수로 입력하거라~~");
        }

        System.out.println("result " + result);









    }
}
