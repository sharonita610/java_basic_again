package day04;

public class FieldAndLocal {
    
    int a ; // 필드

    double b;
    
    void mm(int b){ // 매개변수
        int c ;// 지역변수


        if(a > 10){
            c = 99;
        } else if(a < 99 ){
            c= -100;
        }else {
            c = 50;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
    
    
    
    
    
}
