package day12.inner;

// 계산 기능을 명세
// 두 개의 정수를 상황에 맞게 연산 할 수 있다.


// 람다 사용이 가능한지 체크 : 추상 메서드가 1개인 경우

@FunctionalInterface // 이걸 붙였을때 에러가 안나면 람다 사용 가능


public interface Calculator {

    int operator(int n1, int n2);


}
