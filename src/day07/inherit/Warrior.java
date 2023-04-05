package day07.inherit;

public class Warrior extends Player {

    int rage; // 분노게이지

    public Warrior(String nickName) {
        super(nickName);
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.rage = 20;

    }

    public Warrior() {
        this("이름없음");
    }

    // 파워슬래시
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다");

    }

    // 오버라이딩
    // 부모의 시그니처(리턴타이브 이름 파라미터)를 똑같이 사용해야됨
    // 접근제한자는 무조건 부모보다 public 해야함


    @Override // 오버라이딩 검사
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage : " + this.rage);
    }

}
