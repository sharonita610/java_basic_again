package day09.abs;

/*
    추상화:
    1. 객체 생성을 불가하게 함
    2. 메서드는 오버라이딩을 위한 껍데기 역할에 국한되도록 제한
    3.

 */
public abstract class Pet {

    private String name; // 이름
    private String king; // 종
    private int age; // 나이

    public Pet(String name, String king, int age) {
        this.name = name;
        this.king = king;
        this.age = age;
    }

    // 오버라이팅을 위한 메서드
    // 클래스가 추상이 아니면 추상 메서드 선언 불가
    // 추상은 필필수 기능이다. 추상 클래스에 일만 메서드는 선언 가능
    public abstract void takeNap();

    public abstract void eat();

    public void walk(){
        System.out.println("애완동물은 산책을 해요~");
    }



}
