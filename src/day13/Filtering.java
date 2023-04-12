package day13;

import day07.util.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Dish.Type.MEAT;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Filtering {

    public static void main(String[] args) {

        // stream의 filter
        // 필터 조건에 맞는 데이터들을 필터링

        // 메뉴 목록 중에 채식주의자가 먹을 수 있는 요리를 알려주세요
        // menu가 static 이라서 바로 menu.menuList로 접근 가능함
        /*
            List<Dish> filteredList = menuList.stream()
                    .filter(new VegePredicate())
                    .collect(Collectors.toList());

            System.out.println("=======채식주의자용 요리 목록=======");
            for (Dish dish : filteredList) {
                System.out.println(dish);
        }*/

        List<Dish> filteredList = menuList.stream()
                .filter(dish -> dish.isVegeterian()) // 람다식으로 바꿈,
//                .filter(Dish::isVegetarian) -> 이렇게도 사용 할 수 있지만, 굳이

                .collect(toList());                  // 대문자는 static


        System.out.println("=======채식주의자용 요리 목록=======");
//        for (Dish dish : filteredList) {
//            System.out.println(dish);
//        }

        /*
            filteredList.forEach(new Consumer<Dish>() {
            @Override
            public void accept(Dish dish) {
                System.out.println(dish);
            }
            });
        */
        // 위에 코드를 람다로 바꾸면 이렇게 된다
        filteredList.forEach(dish -> System.out.println(dish));

         /*
            원래 이거
            List<Dish> vegeList = new ArrayList<>();
            for (Dish dish : vegeList) {
            if(dish.isVegeterian()){
                vegeList.add(dish);
            }
        }*/

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링

        makeLine();

        // 메서드 체인이라고 함.
        menuList.stream()
                .filter(d -> d.getType() == MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(System.out::println); // 출력가지 바로 한다면 이렇게 .forEach를 이어 쓰면 됨


        makeLine();

        // 메뉴 목록에서 요리의 이름이 4글자인 요리들만 필터링해서 출력
        menuList.stream()
                .filter(d -> d.getName().length() == 4)
                .collect(toList()).forEach(System.out::println);

        makeLine();

        // 원하는 개수만 필터링하기
        // 칼로리가 300보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) // 앞에서부터 3개만 추출 할 수 있다.
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();

        // 칼로리가 300칼로리보다 높은 요리 중 처음 2개는 제끼고 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외
                .limit(3)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();

//        List <Dish> meatDisshList = new ArrayList<>(); 
//         이건 내가 만든건데, 바로 menuList.으로 연결하면 됨
        
        //메뉴 목록에서 처음 등장하는 2개의 고기 요리를 필터링해서 배열에 담기 출력
        List <Dish> meatDishList = menuList.stream()
                .filter(d -> d.getType() == MEAT)
                .limit(2)
                .collect(toList());

        System.out.println("meatDishList = " + meatDishList);
                
        
        makeLine();

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);
        
        // 리스트에서 중복 제거하기
        List<Integer> distinctedList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복제거
                .collect(toList());

        System.out.println("distinctedList = " + distinctedList);
                
        
        
        
       /*
            메서드 체인의 예시

            String greeting = "hello world!";
            String s = greeting.toUpperCase();
            String sub = s.substring(0, 5);
            char c = sub.charAt(1);
            System.out.println("c = " + c);

            위에 부분을 이렇게 체인으로 줄줄이 만들어 둘 수 있다.
            char c = "hello world".toUpperCase().substring(0,5).charAt(2);
            System.out.println("c = " + c);
        */


    }


}
