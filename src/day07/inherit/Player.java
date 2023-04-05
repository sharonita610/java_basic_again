package day07.inherit;

// 수퍼클래스 (부모클래스) : 객체의 공통기능과 속성을 설계

public class Player extends Object{ // 수퍼클래스에 상속을 안주면 Object 가 기본 셋팅이 된다

    String nickName; // 캐릭터 이름
    int level;
    int hp;
    int exp;

    // 부모의 생성자


    public Player(String nickName) {
        super(); // 숨어있다
        System.out.println("Player의 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public void showStatus() {
        System.out.println("\n===== Character's info =====");
        System.out.println("# name : " + nickName);
        System.out.println("# level : " + this.level);
        System.out.println("# hp : " + this.hp);
    }
}
