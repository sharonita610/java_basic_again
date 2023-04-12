package day13;

import day12.lambda.Color;

import java.util.Comparator;

import static day07.util.Utility.makeLine;
import static day13.Menu.menuList;

public class Finding {
    public static void main(String[] args) {

        // 메뉴 목록에서 채식 주의가 먹을 수 있는 요리가 하나라도 존재 하는가?

        boolean flag = menuList.stream()
                .anyMatch(d -> d.isVegeterian()) ;// 존재 하는가? 매치되는게 있는가?

        System.out.println("flag = " + flag);
        
        makeLine();
        
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.getCalories() < 100 );
        System.out.println("flag1 = " + flag1);


        makeLine();

        // 메뉴 목록의 모든 요리가 1000칼로리 미만인가?
        boolean flag2 = menuList.stream().allMatch(d -> d.getCalories() < 1000);
        System.out.println("flag2 = " + flag2);

        makeLine();

        // nonMatch : all match 의 반대연산
        boolean flag3 = menuList.stream().noneMatch(d -> d.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

        makeLine();

        // 음식 중에 칼로리가 제일 낮은 음식을 찾는다.
        Dish dish = menuList.stream() 
                .min(Comparator.comparing(d-> d.getCalories()))
                .get();

        System.out.println("dish = " + dish);




    }
}
