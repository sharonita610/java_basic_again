package day12.lambda;

import day05.member.Gender;
import day05.member.Member;
import day06.modi.pac1.A;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day07.util.Utility.makeLine;
import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.map;

public class Main {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(

                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, GREEN)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("====== 초록 사과 필터링 ======");
        List<Apple> greenApples
                = filterGreenApples(appleBasket);

        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println();

        List<Apple> colorApples
                = filterApplesByColor(appleBasket, YELLOW);

        for (Apple ca : colorApples) {
            System.out.println(ca);
        }

        System.out.println("====== 원하는 조건으로 필터링 ======");

        List<Apple> filterApples
                = filterApples(appleBasket, new LightApplePredicate());
        for (Apple filterApple : filterApples) {
            System.out.println(filterApple);
        }

        System.out.println("====== 빨간 사과만 필터링 ======");

        List<Apple> filterApples1 = filterApples(appleBasket, apple -> apple.getColor() == RED);
        for (Apple apple : filterApples1) {
            System.out.println(apple);

        }

        makeLine();


        // 녹색이면서 100g 보다 큰 사과


        System.out.println("== 녹색이면서 100g 이상인 사과 필터링 ==");

        List<Apple> filteringApple = filterApples(appleBasket, apple -> apple.getWeight() > 100 && apple.getColor() == GREEN);

        for (Apple apple : filteringApple) {
            System.out.println(apple);

        }


        makeLine();

        System.out.println("그냥 필터");

        filter(appleBasket, apple -> apple.getWeight() > 100 && apple.getWeight() <= 150);
        for (Apple apple : filteringApple) {
            System.out.println(apple);
        }

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> filters = filter(numbers, n -> n % 2 == 0);
        System.out.println("filters = " + filters);

        List<String> wordList = List.of(
                "moments", "hello", "apple", "banana", "ace"
        );
        List<String> filter1 = filter(wordList, w -> w.length() == 5);
        System.out.println("filter1 = " + filter1);

        List<String> filter3 = wordList.stream()
                .filter(w -> w.length() < 5).collect(Collectors.toList());
        System.out.println("filter3 = " + filter3);


        makeLine();

        List<Color> colorList = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        // 회원 정보에서 회원의 닉네임만 춫울

        List<Member> memberList = List.of(
                new Member("abc@def.com", "1234", "홍길동", 1, Gender.FEMALE, 33)
                , new Member("abc@def.com", "1235", "홍길하", 2, Gender.FEMALE, 33)
                , new Member("abc@def.com", "1236", "홍길가", 3, Gender.FEMALE, 33)
                , new Member("abc@def.com", "1237", "홍길나", 4, Gender.FEMALE, 33)
                , new Member("abc@def.com", "1238", "홍길다", 5, Gender.FEMALE, 33)
                , new Member("abc@def.com", "1239", "홍길라", 6, Gender.FEMALE, 33)
        );

        List<String> nameList = map(memberList, m -> m.memberName);
        System.out.println("nameList = " + nameList);

    }


}
