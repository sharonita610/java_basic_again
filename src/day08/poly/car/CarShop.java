package day08.poly.car;

//자동차 판매 대리점
public class CarShop {


    Car[] cars;


//  CarShop  Mustang[] mustangs;
//    Stinger[] stingers;
//    Veloster[] velosters;


    // 대리점에 차를 입고하는 기능

    public void importCar() {

        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Veloster(),
                new Stinger(),

        };

        // 문자열과 정수과 놀리를 배열에 담을 수 있는가?

        Object[] oArr = {
                50, 50.1, "zzz", false, new Mustang(),
        };

    }

    // 주행테스트 기능
    public void runTest() {

        importCar(); // 차입고
        for (Car car : cars) {
            car.accelerate();
        }

    }
    //차를 고객에게 인도하는 기능


    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 5000) {
            return new Stinger();
        } else if (money == 3000) {
            return new Veloster();
        } else {
            return null;
        }
    }


}
