package day03;

public class MethodBasic {

    // 함수 : 코드 블록의 기능적 표현
    // ex ) add (10, 20)
    // 메서드 : 객체의 동작 표현
    // ex ) 샤프계산기.add (10, 20)
    // ex ) 카시오계산기.add (20, 30)

    // 자바는 모든 것ㅇ르 객체로 표현하고, 함수마저도 모두 메서드로 처리한다
    // 자바의 메서드는 클래스 내부에만 선언이 가능
    // 다른 메서드 안에서 선언 할 수 없음.

    // 2개 정수를 더해서 리턴하는 메서드

    static int add(int n1, int n2){
        return n1 + n2;
    }

    // 리턴값이 없는 함수

    static  void makeLine(){
        System.out.println("-===============");
    }

    // 여러 값을 리턴하고 싶은 경우
    // 2개 정수 전달하면 덧셈, 뺄셈 , 곱셈 결과 리턴

    int[] operateAll(int n1, int n2){ // shift f6

        return new int[]{  // return 에서 ctrl alt v
                n1 + n2,
                n1 - n2,
                n1 * n2,

        };// return 에다가 넣을때 ctrl alt n
    }

    // n개의 정수를 전달받아 총합을 리턴

    static int addAll(int... numbers){ // int [] 를 변화시킨거, 배열또는 일반 값으로 줘도 된다
            int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }


    // 2개의 정수 배열을 전달받아
    // 들어있는 숫자의 개수가 더 만은 배열을 리턴하는 메서드

    static int[]compareNumbers(int[] arr1, int[] arr2){
        return arr1.length > arr2.length ? arr1 : arr2;
//        if(arr1.length > arr2.length){
//            return arr1;
//        } else {
//            return arr2;
//        }
    }

    public static void main(String[] args) {

        int result = add(10, 20);
        System.out.println(result);

        makeLine();

        int r1 = addAll(new int[]{10, 20, 30});
        System.out.println("r1 = " + r1);

        int r2 = addAll(new int[]{10, 20, 30});
    }
}
