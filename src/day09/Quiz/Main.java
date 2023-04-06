package day09.Quiz;

public class Main {
    public static void main(String[] args) {

        Smartphone[] smartphones = {
                new Galaxy("삼성"),
                new Iphone(),
        };

        for (Smartphone smartphone : smartphones) {
            String message = smartphone.information();
            System.out.println(message);
        }


    }
}
