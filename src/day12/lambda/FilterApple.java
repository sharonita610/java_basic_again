package day12.lambda;


import day06.modi.pac1.A;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러 방법으로 필터링
public class FilterApple {

    /**
     * @return : 녹색사과들만 모여있는 바구니
     * @solution - try1 : 사과 바구니에서 녹색 사과만 필터링 해야한다.
     * @problem - 만약에 다른 색깔의 사과를 필터링 해야한다면 ?
     * - 새로운 메서드가 필요하다
     * @param1 basket : 여러 사과가 모여있는 바구니
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        // 녹색 사과만 담을 바구니
        List<Apple> greenApples = new ArrayList<>();

        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }
        }

        return greenApples;

    }
    /*

    System.out.println("====== 초록 사과 필터링 ======");
        List<Apple> greenApples
                = filterGreenApples(appleBasket);

        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

     */






    /**
     * @solution - try 2: 색상을 파라미터화 한다.
     *
     * @problem
     * - 만약에 필터 기준이 색상이 아니라 무게라면
     */


    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        // 녹색 사과만 담을 바구니
        List<Apple> filteredApples = new ArrayList<>();

        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredApples.add(apple);
            }
        }

        return filteredApples;

    }

    /**
     * @solution - try 3: 동작을 파라미터화 한다.
     * - 추상적 조건으로 필터링
     *
     * @problem :
     * - 오렌지 바구니를 필터링 해야한다면 ?
     * - 전자제품 바구니를 필터링 해야한다면 ?
     *
     *
     */



    public static List<Apple> filterApples(List<Apple> appleBasket, ApplePredicate p ) {

        // 특정 사과만 담을 바구니
        List<Apple> filteredApples = new ArrayList<>();

        // 반복문을 통해 필터링
        for (Apple apple : appleBasket) {
            if (p.test(apple)) {
                filteredApples.add(apple);
            }
        }

        return filteredApples;

    }


    /**
     * @solution - try 4 : 제네릭 필터 메서드 생성
     *
     */
    public static<T> List<T> filter(List<T> basket, GenericPredicate<T> p){
        List<T> filterList = new ArrayList<>();
        for (T t : basket) {
            if(p.test(t)){
                filterList.add(t);
            }
        }
        return filterList;
    }
}


