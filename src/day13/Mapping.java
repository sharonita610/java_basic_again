package day13;

import java.util.List;
import java.util.function.Function;

import static day07.util.Utility.makeLine;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Mapping {
    public static void main(String[] args) {

        // stream 의 map : 리스트에서 원하는 정보만 추출

        // 메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(toList());

        System.out.println("dishNames = " + dishNames);

        makeLine();

        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> wordLengths = words.stream()
                .map(w -> w.length())
                .collect(toList());

        System.out.println("wordLengths = " + wordLengths);


        makeLine();

        // 메뉴 목록에서 메뉴 이름과 칼로리를 추출하는데,
        // 칼로리를 정수가 아닌 문자열로 kcal을 뒤에 붙여서 추출 후
        // 메뉴 이름 : xxxkcal 로 반복 출력하고 싶음

        List<SimpleDish> simpleDishes = menuList.stream()
                .map(new Function<Dish, SimpleDish>() {
                    @Override
                    public SimpleDish apply(Dish dish) {
                        SimpleDish sd = new SimpleDish(
                                dish.getName(),
                                dish.getCalories() + "kcal");
                        return sd;
                    }
                })
                .collect(toList());

        simpleDishes.forEach(sd -> System.out.println(sd));

        makeLine();

        List<SimpleDish> simpleDishes1 = menuList.stream()
                .map( dish ->  new SimpleDish(dish.getName(),
                                dish.getCalories() + "kcal"))
                .collect(toList());

        simpleDishes1.forEach(sd -> System.out.println(sd));

        List<SimpleDish> simpleDishes2 = menuList.stream()
                .map( dish ->  new SimpleDish(dish))
                .collect(toList());

        simpleDishes2.forEach(sd -> System.out.println(sd));

        // 막강
//        List<SimpleDish> simpleDishes3 = menuList.stream()
//                .map(simpleDishes3::new)
//                .collect(toList());
//
//        simpleDishes2.forEach(sd -> System.out.println(sd));

        makeLine();

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰 음식들을 필터링한 다음에
            음식의 이름과 타입만 추출해서 출력해주세요
         */

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(
                        dish -> new DishDish(

                                dish.getName(),
                                dish.getType()
                        ))
                .collect(toList())
                .forEach(System.out::println);

        makeLine();
        
        // 메뉴 목록에 있는 요리들의 총칼로리수 구하기
        int totalCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("totalCal = " + totalCal);

        makeLine();
        // 평균값 구하기, average 는 특이하게 주니까 밑에 .getAsDouble로 처리하면 깔끔하다.

        double avgCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        // 일반 더블로 반환되니까 %.1f 이런걸로 처리하면 깔끔하게 처리가 가능하다.

        System.out.printf("avgCal = %.1f kcal \n", avgCal);


        
    }
}
