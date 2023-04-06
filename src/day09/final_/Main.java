package day09.final_;

public class Main {

    public static void main(String[] args) {


        Person kim = new Person("김철수", "000111-32123456", "대한민국", new BagPack(5, "샘소나이트"));

        kim.name = "김출수";
//        kim.ssn = "02111-1123456";
        kim.bagPack = new BagPack(10, "기본");



    }

}
