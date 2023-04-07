package day10.collection.song;

import java.util.Set;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;

public class MusicView {
    private static MusicRepository ar;

    static {
        ar = new MusicRepository();
    }


    public static void start() {
        while (true) {
            System.out.println("\n\n***** 음악 관리 프로그램 *****");
            System.out.printf("# 현재 등록된 가수 : %d명\n", ar.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();

            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;


                case "2":
                    searchProcess();
                    break;


                case "3":
                    System.out.println("\n# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;


            }

        }
    }

    // 1번 메뉴
    private static void insertProcess() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명 : ");
        String songName = input("- 노래명 : ");

        // 신규가수인가?
        if (!ar.isRegistered(artistName)) {
            ar.addNewArtist(artistName, songName);
            System.out.printf("\n# %s님이 신규 등록 되었습니다.\n", artistName);
        } else {
            boolean flag = ar.inputSong(artistName, songName);
            if(flag){
                System.out.printf("\n# %s 님의 노래 목록에 %s곡이 추가되었습니다.\n", artistName, songName);

            }else {
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
            }

        }


    }


    // 2번 메뉴
    private static void searchProcess() {

        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String artistName = input("- 가수명: ");

        if(ar.isRegistered(artistName)){
            // 등록된 경우
            System.out.printf("\n# %s님의 노래 목록 \n", artistName);
            Set<String> songList = ar.getSongList(artistName);
            int i = 0;
            for (String song :songList) {
                System.out.printf("* %d. %s\n", i+1, song);
                i++;
            }

        } else {
            System.out.printf("\n# %s 님은 등록되어있지 않습니다.", artistName);

        }
    }


}
