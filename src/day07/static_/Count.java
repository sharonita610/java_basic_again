package day07.static_;

public class Count {


    // 제한자(modifier)
    // 접근 제한자(Access), 사용제한자(Usage)
    public static int x; // 정적필드 : 모든 객체가 공유
    public int y; // 인스턴스 필드 : 객체별로 관라

    // 정적 메서드
    public static void m1(Count c4) {
        System.out.println("static method 호출");

        // 필드 참조  (static 메서드 안에서는 satatic 필드만 참조가능)
        // static은 this 정보를 알수가 없어서 호출 불가능

        System.out.println(" x = " + x);
//        System.out.println(" y = " + y);



        Count c3 = new Count();
        System.out.println("c4.y = " + c4.y);
    }
    // 인스턴스 매서도


    public void m2() {
        System.out.println("인스턴드 메서드 호출");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
    }


}
