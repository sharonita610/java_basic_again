package day09.abs;

public class Dog extends Pet {


    public Dog(String name, String king, int age) {
        super(name, king, age);
    }

    public void eat() {
        System.out.println("강아지는 사료를 먹어요");
    }

    public void takeNap() {
        System.out.println("강아지는 마당에서 낮잠을 자요");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
