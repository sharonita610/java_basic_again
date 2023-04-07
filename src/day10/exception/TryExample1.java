package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0;


        System.out.println("나눈셈 시작!");

       /*
            이것처럼 100프로 에러 나는 코드는 지워야된다.
            String s = null;
            s.length();

            ** 예외처리는 예외 발생 가능성이 있는 코드에 예외 처리를 하는거다. **
        */


        try {
            System.out.printf("%d / %d = %d \n", n1, n2 , n1 / n2);
        } catch (Exception e) {

            System.out.println("0으로 나눌 수 없습니다.");
            // 개발시에 쓰는 코드 (로그 트레이싱)

            e.printStackTrace();

        } finally { // 예외가 발생하면 처리할 코드
        }

        System.out.println("프로그램 정상 종료");


    }
}
