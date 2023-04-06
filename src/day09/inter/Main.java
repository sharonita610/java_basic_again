package day09.inter;

public class Main {
    public static void main(String[] args) {

        BullDog bullDog = new BullDog();
        bullDog.eat();
        bullDog.hunt();
        bullDog.violent();


        Duck duck = new Duck();
        duck.eat();

        // 인터페이스는 다형성을 구현하는 역할

        Pet[] pets = {
                bullDog, duck, new Rabbit(),
        };

        for (Pet pet : pets) {
            pet.eat();
        }


        Shark shark = new Shark();
        shark.hunt();
        shark.violent();


    }
}
