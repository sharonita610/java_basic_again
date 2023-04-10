package day11.api.obj;


import java.util.Objects;

public class Pen extends Object {

    Company company; // 제조 회사

    long sereal; // 시리얼 번호
    String color; // 색상
    int price; // 가격

    public Pen(long sereal, String color, int price) {

        this.sereal = sereal;
        this.color = color;
        this.price = price;
    }


    // 시리얼 번호가 같으면 같은 객체로 보고싶다
    // equals 를 오버라이딩 하면 반드시 hashcode 도 같이 오버라이딩 해야됨.

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Pen) {
            Pen target = (Pen) obj;
            return this.sereal == target.sereal;
        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(sereal);
    }

    // 객체의 필드 데이터를 빠르게 확인해볼때 이걸 재정의 한다.


    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", sereal=" + sereal +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
