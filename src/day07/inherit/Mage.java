package day07.inherit;

import day02.StdIo;

import java.util.Arrays;

import static day07.util.Utility.makeLine;

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
    public void thunderBolt(Player... targets) {



        System.out.println("#충격왕 쇼킹님 썬더볼트 시전!!!");
        makeLine();


        for (Player target : targets) {
            // 맞은 사람이 나인가?
            if(target == this) continue;

            int damage = (int)(Math.random() * 6 + 10);

            // 실제 체력에서 차감
            target.hp -= damage;

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , target.nickName, damage, target.hp);

        }

    }

    @Override
    public void showStatus() {
        super.showStatus();

        System.out.println("# mana : " + this.mana);
    }

}
