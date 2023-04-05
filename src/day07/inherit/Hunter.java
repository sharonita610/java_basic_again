package day07.inherit;
// 상속을 받는 클래스, 서브클래스, 하위 클래스 (자식 클래스)
public class Hunter extends Player{

    int concentration; // 집중력

    public Hunter(String nickName) {
        super(nickName);
        this.level = 1;
        this.hp = 50;
        this.concentration = 100;
    }

    public void summonBeast() {

    }

    @Override
    public void showStatus() {
        super.showStatus();

        System.out.println("# concentration : " + this.concentration);
    }
}
