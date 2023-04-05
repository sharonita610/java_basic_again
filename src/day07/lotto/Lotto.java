package day07.lotto;

import java.util.Arrays;

public class Lotto {


    private static int[] lotto = new int[6];


    private static void makeLotto() {
        int i = 0;
        while (i < lotto.length) {
            // 1 ~ 45 범위의 랜덤정수
            int rn = (int) (Math.random() * 45 + 1);
            if (!isDuplicate(lotto, rn)) { // 만약 중복숫자가 아니라면
                lotto[i] = rn;
                i++;
            }
        }
    }

    protected static boolean isDuplicate(int[] targetLotto, int rn) {
        for (int n : targetLotto) {
            if (rn == n) return true;
        }
        return false;
    }

    public static void information() {
        makeLotto();
        System.out.println(Arrays.toString(lotto));
    }

    protected static int[] getLotto() {
        makeLotto();
        return lotto;
    }
}

    /*
    내가 생각 한 답
    public static int[] information() {

        // 로또 번호를 담을 배열하나를 생성한다.
        int[] lotto = new int[6];

        // 배열에 6개의 숫자를 넣을 수 있도록 한다 랜덤숫자.
        for (int i = 0; i < 6; i++) {
        double randomNum = (Math.random() * 42) + 1;
            lotto[i] = (int) randomNum;
            // 중복을 제거한다.
            for (int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]) i--;

            }
        }

        System.out.println(Arrays.toString(lotto));

        return lotto;
    }*/



