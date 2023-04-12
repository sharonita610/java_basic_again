package day13;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.util.Utility.makeLine;
import static day13.Menu.menuList;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {

        // stream 의 정렬(sorted)

        // 메뉴 목록 중 칼로리가 낮은 순으로 정렬

        menuList.stream()
                .sorted(comparing(d -> d.getCalories()))
                .collect(toList())
                .forEach(d-> System.out.println(d));

        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        makeLine();
        // 메뉴 목록 중 이름으로 내림차 정렬
        menuList.stream()
                .sorted(comparing(Dish::getName).reversed())
                .collect(toList())
                .forEach(d-> System.out.println(d));

        makeLine();

        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(comparing(dish -> dish.getCalories()))
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);

        // 위에거랑 같은 코드
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(comparing(Dish::getCalories))
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);



    }
}
