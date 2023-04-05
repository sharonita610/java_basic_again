
package day07.lotto;

import day07.util.Utility;

import java.util.Arrays;

public class LottoSimulator {

    private static int[] makeMyLotto() {
        // 나의 번호
        System.out.println("구매번호를 6개 차례대로 입력하세요.");
        int[] myLotto = new int[6];

        int i = 0;
        while (i < myLotto.length){
            int number = Integer.parseInt(Utility.input(String.format("%d번째 번호 >> ", i+1)));

            if (!Lotto.isDuplicate(myLotto, number)) {
                myLotto[i] = number;
                i++;
            } else {
                System.out.println("# 중복번호입니다.");
            }
        }

        return myLotto;
    }

    public static int checkLotto(int[] winNumbers, int[] myLotto) {
        int count = 0 ;  // 일치한 숫자의 수
        for (int n : winNumbers) {
            for (int m : myLotto) {
                if (m == n) count++;
            }
        }
        return count;
    }

    public static void run() {
        // 1등 당첨번호
        int[] winNumbers = makeMyLotto();

        int paper = 0; // 구매한 장수
        while (true) {
            int[] purchasedLottoNumbers = Lotto.getLotto();
            paper++;

            int count = checkLotto(winNumbers, purchasedLottoNumbers);

            if (count == 6) {
                System.out.printf("# %d장만에 1등에 당첨되었습니다. ㅊㅋㅊㅋ\n", paper);
                break;
            } else {
                System.out.printf("# %d장째 구매중... ㅠㅠ\n", paper);
            }
        }
    }
}




// 내가 생각한 로또 답
/*
public class LottoSimulator {

    static Scanner sc = new Scanner(System.in);

    public static void run() {
        // 생성된 로또번호를 lottoNum에 담아둠
        int[] lottoNum = Lotto.information();

        int[] inputNum = new int[6];
        int input = 0;
        int equalNum = 0;
        // 사용자에게서 lotto번호를 입력받는다.

        System.out.println("구매번호를 6개 차례대로 입력하세요.");
        for (int i = 0; i < lottoNum.length; i++) {
                System.out.println( (i + 1)+ "번째 번호 >>");
                input = sc.nextInt();
                inputNum[i] = input;

        }
        System.out.println(Arrays.toString(inputNum));
        System.out.println(Arrays.toString(lottoNum));


        // 로또번호 검사
        for (int i = 0; i < lottoNum.length; i++) {
            for (int j = 0; j < inputNum.length; j++) {
                if (lottoNum[i] == inputNum[j]) {
                    equalNum ++;
                }
            }
        }
        System.out.println(equalNum);

        // 맞춘 갯수에 따른 등수 출력
        switch(equalNum){
            case 6 :
                System.out.println("당첨!! 100억!");
                break;
            case 5 :
                System.out.println("3등! 500만원!");
                break;
            case 4:
                System.out.println("4등! 5만원!");
                break;
            case 3:
                System.out.println("5등! 5000원!");
                break;
            default:
                System.out.println("다음기회에 ㅠㅠ");
                break;
        }

        while(true){




        }

    }
}
*/
