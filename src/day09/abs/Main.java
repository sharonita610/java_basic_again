package day09.abs;

import day06.modi.pac2.C;

public class Main {
    public static void main(String[] args) {


        Pet[] pets = {
                new Dog("해피", "푸들", 2),
                new Dog("초코", "시츄", 3),
                new Dog("최강", "불독", 4),
                new Cat("꾸꾸까까", "러시안블루", 2),
        };
//        new Pet("그냥동물", "그냥 종 ", 1);

        GoldFish goldFish = new GoldFish("붕어", "금붕어", 1);
        goldFish.eat();
        goldFish.takeNap();


        for (Pet pet : pets) {
            pet.takeNap();
            pet.eat();
        }
    }
}
