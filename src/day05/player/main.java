package day05.player;

public class main {
    public static void main(String[] args) {


        Player parking = new Player("주차왕파킹");
        Player gondue = new Player("딸긔 겅듀");
        new Player();
        gondue.attack(parking);
        parking.attack(gondue);

        System.out.println(parking.hp);
        System.out.println("parking 의 주소 : " + parking);



    }
}
