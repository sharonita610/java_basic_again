package day10.generic;

import day04.array.StringList;
import day09.musicProgram.Artist;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());

        Banana fruit1 = bananas.getFruit();

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");

        System.out.println(sl);

        MyList<Integer> numbs = new MyList<>();
        numbs.push(10);
        numbs.push(10);
        numbs.push(10);

        System.out.println(numbs);

        MyList<Artist> artist = new MyList<>();

        artist.push(new Artist("동방신기", new StringList("hug")));
        System.out.println(artist);
    }
}
