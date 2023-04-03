package day04;


// 실행용 클래스
// 여기엔 설계를 하지 않고 main 메서드를 작성합니다


public class DancerMain {
    public static void main(String[] args) {


        Dancer kim = new Dancer();
        Dancer park = new Dancer("스트릿 댄스");
        Dancer jang = new Dancer("장돌견", "목각댄스",DanceLevel.PRO);

//        kim.dancerName = "김관종";
//        kim.crewName = "서커스크루";

//        Singer song = new Singer();


        System.out.println(kim);
        System.out.println(park);

        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        System.out.println(jang.introduce());

        kim.dance();
        park.dance();
        jang.dance();

    }
}
