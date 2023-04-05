package day07.Quiz;

class Parent1 {
    int compute(int num) {
        if (num <= 1) return num;
        return compute(num - 1) + compute(num - 2);
    }
}

class Child1 extends Parent {
    int compute(int num) {
        if (num <= 1) return num;
        return compute(num - 1) + compute(num - 3);
    }
}

/**
 * 접근 방법. 첫 호출이 compute 4를 호출 -> return compute (num-1) + compute (num-3)
 * compute (3) -> return compute(2) + compute(0)
 * compute (2) -> return compute(1) + compute(-1) = > 0
 * compute (1) -> return 1
 * compute (0) -> return 0
 * compute (-1) -> return -1
 *
 *
 */

public class Gisafirst {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        System.out.print(obj.compute(4));
    }
}



