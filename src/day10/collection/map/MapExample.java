package day10.collection.map;

import com.sun.security.jgss.GSSUtil;
import day09.musicProgram.Artist;

import java.util.HashMap;
import java.util.Map;

import static day07.util.Utility.makeLine;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // put (K, V) : 데이터 추가
        map.put("지갑잔액",5000);
        map.put("좋아하는 가수",new Artist("동방신기", null));
        map.put("저녁메뉴", "볶음밥");


        makeLine();
        System.out.println(map.size());


        // get(key) : 데이터 참조
        Object dinner = map.get("저녁메뉴");
        System.out.println(dinner);

        Artist artist = (Artist)map.get("좋아하는 가수");
        artist.info();


        makeLine();
        System.out.println(map);

        map.put("저녁메뉴", "짬뽕");
        System.out.println(map);


        // 반복문 처리

        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }






    }
}
