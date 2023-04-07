package day10.collection.set;


import java.util.*;

import static day07.util.Utility.makeLine;

/*
    - 집합 자료구조
    - 저장 순서를 보장하지 않음
    - 인덱스, 키를 사용하지 않아서 개별탐색이 불리함
    - 저장 값의 중복을 허용하지 않음
 */
public class SetExample {
    public static void main(String[] args) {

        Set<String> foodSet = new HashSet<>();

        // 데이터  추가 add(E e)

        foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("닭볶음탕");
        foodSet.add("떡볶이");
        foodSet.add("김밥");

        makeLine();
        System.out.println(foodSet.size());
        System.out.println(foodSet);

        makeLine();
        for (String s : foodSet) {
            System.out.println(s);
        }

        // remove(obj) : 삭제
        foodSet.remove("닭꼬치");
        System.out.println(foodSet);

        makeLine();
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,1,1,3,3,5,7,9,5,6,7)
        );

        // 리스트를 셋으로 변환

        HashSet<Integer> numberSet = new HashSet<>(numbers);
        System.out.println(numberSet);
    }
}
