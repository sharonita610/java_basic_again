package day07.inherit;

import day02.StdIo;

public class Mage extends Player {


    int mana;// 마력게이지
    private String nickName;


//    public Mage(String nickName) {
//        this.nickName = nickName;
//        this.level = 1;
//        this.hp = 50;
//        this.mana = 100;
//    }


    public Mage(String nickName) {
        super(nickName);
        this.nickName = nickName;
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderBolt() {

    }

    @Override
    public void showStatus() {
        super.showStatus();

        System.out.println("# mana : " + this.mana);
    }

}
