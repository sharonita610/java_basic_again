package day10.collection.list;


import java.sql.Array;
import java.util.*;

import static day07.util.Utility.makeLine;

/*
    - 저장 데이터의 순서를 보장
    - 인덱스를 가지고 있음
    - 중복 데이터를 저장 가능

 */
public class ListExample {
    public static void main(String[] args) {

        List<String> foodList = new ArrayList<>();

        //add (E e) : 끝에 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("파스타");
        foodList.add("리조또");
        foodList.add("마라탕");
        foodList.add("꿔바로우");

        // add(index, element) : 중간 삽입

        foodList.add(2, "족발");


        // size() : 저장된 데이터 개수를 반환

        System.out.println(foodList);

        int size = foodList.size();
        System.out.println("size : " + size);

        // indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("마라탕");
        System.out.println(index);

        // include(E e) :  해당데이터 저장 유무 확인

        System.out.println(foodList.contains("짜장면"));
        System.out.println(foodList.contains("김밥"));

        // remove(index), remove(obj)
        String removed = foodList.remove(1);
        foodList.remove("닭강정");

        System.out.println(removed);
        System.out.println(foodList);


        // set (index, newElement) : 수정

        foodList.set(0, "동파육");
        System.out.println(foodList);

        //get(index) : 리스트에 저장된 데이터 참조

        String s = foodList.get(2);
        System.out.println(s);

        makeLine();
        makeLine();
        // 반복문 처리
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }

        makeLine();
        for (String food : foodList) {
            System.out.println(food);
        }

        makeLine();
        // clear(): 내부 데이터 전체 삭제
        foodList.clear();
        System.out.println(foodList);
        System.out.println(foodList.isEmpty());


        // 리스트에 초기값 넣고 시작하기

        List<String> tvxq = new ArrayList<>(

                Arrays.asList("유노윤호", "최강창민")

        );
        System.out.println(tvxq);
        makeLine();

        // 정렬 (듀얼 피벗 퀵 정렬)
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5, 30, 17, 9 , 50, 413)
        );

        System.out.println(numbers);

        // 오름차 정렬

        Collections.sort(numbers);
        makeLine();
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        makeLine();
        System.out.println(numbers);

    }
}
