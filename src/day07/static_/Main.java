package day07.static_;

import day07.util.Utility;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;
import static java.lang.System.out;

//static 필드와 메서드를 그냥 참조 가능

public class Main  {
    public static void main(String[] args) {

        Count.m1(new Count());

        out.println(Count.x);
        out.println(Math.random());

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2();

        Count.x = 10;
        c2.y = 20;

        Count.x++;


        out.printf("c1 =  x: %d, Y:%d\n", c1.x, c1.y);
        out.printf("c2 =  x: %dY, :%d\n", c1.x, c2.y);


        Calculator cal1 = new Calculator(); // kim
        Calculator cal2 = new Calculator(); // park

        cal1.color = "빨강";
        cal2.color = "초록";

        Calculator.calcAreaCircle(5);

        makeLine();
        makeLine();
        makeLine();
        makeLine();


        input("하하호호");
    }


}
