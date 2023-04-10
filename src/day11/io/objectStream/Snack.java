package day11.io.objectStream;

import java.io.Serializable;


// 객체를 직렬화해야 바이트 스트림을 통과할 수 있음
public class Snack implements Serializable {

    public enum Taste {
        GOOD, BAD, SOSO;

        Taste() {
        }


    }

    private String snakName; // 과자이름
    private int year; // 출시 연도
    private int price; // 가격
    private Taste taste;

    public Snack() {
    }

    public String getSnakName() {
        return snakName;
    }

    public void setSnakName(String snakName) {
        this.snakName = snakName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public Snack(String snakName, int year, int price, Taste taste) {
        this.snakName = snakName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snakName='" + snakName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }


}
