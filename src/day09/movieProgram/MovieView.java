package day09.movieProgram;

import day08.poly.car.Stinger;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;

public class MovieView {
        MovieRepository mr = new MovieRepository();
    public void start() {

        while (true) {
            System.out.println("\n***** 영화 관리 프로그램 *****");
            System.out.printf("\n# 현재 등록된 배우 : %d 명", mr.countActor());
            System.out.println("\n# 1. 영화 등록하기");
            System.out.println("\n# 2. 영화 정보 검색");
            System.out.println("\n# 3. 프로그램 종료");

            makeLine();
            String inputNum = input(">> ");

            switch (inputNum) {
                case "1":
                    addMovieToList();
                    break;

                case "2":
                    checkMovieInfo();
                    break;

                case "3":
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                    break;

                default:
                    System.out.println("번호를 다시 입력 해 주세요");

            }

        }
    }
    // ================================
    // 옵션 1
    private void addMovieToList() {

        System.out.println("\n# 영화 등록을 시작합니다.");
        String name = input("- 배우명 : ");
        String movie = input("- 작품명 : ");

        // 배우가 리스트에 존재하지 않는다면
        if(!mr.actorExists(name)){
            // 배우를 등록한다
            mr.newActorInscription(name, movie);
            System.out.printf("\n# 배우 %s님이 신규 등록 되었습니다.",name);
        }else{
            // 이미 존재한다면, boolean으로 리턴 받은 값으로 영화 존재 유무를 확인한다.
            boolean flag = mr.addMovieToList(name, movie);
            // 존재하지 않는다면 위에 구문으로 바로 추가하고
            if(flag){
                System.out.printf("\n# %s님의 영화 목록에 ['%s']작품이 추가되었습니다.", name, movie);
            }else{
                System.out.printf("\n# [%s]은(는) 이미 등록된 작품입니다.", movie);
            }

        }

    }


    // 옵션 2
    private void checkMovieInfo() {
        System.out.println("검색할 배우명을 입력해주세요.");
        String name = input("- 배우명: ");

        if(mr.actorExists(name)){
            System.out.printf("\n# %s님의 작품 목록: \n",name);
            makeLine();
            String[] movieList = mr.movieList(name);

            for (int i = 0; i < movieList.length; i++) {
                System.out.printf("* %d. %s\n",i+1, movieList);
            }
        }else{
            System.out.println("해당 배우는 등록되지 않았습니다.");
        }



    }


}
