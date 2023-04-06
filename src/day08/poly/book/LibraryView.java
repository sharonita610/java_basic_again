package day08.poly.book;

import day05.member.Gender;

import java.util.Scanner;

import static day05.member.Gender.*;
import static day05.member.Gender.MALE;
import static day07.util.Utility.input;
import static day08.poly.book.RentStatus.RENT_SUCCESS;
import static day08.poly.book.RentStatus.RENT_SUCCESS_WITH_COUPON;

public class LibraryView {

//    private static Scanner sc;

    private static LibraryRepository repository;

    // static 데이터는 생성자에서 초기화하면 안됨.
    // static 필드의 초기화는 static initializer 을 사용
    static {
//        System.out.println("정적 초기화자 호출!");
//        sc = new Scanner(System.in);
        repository = new LibraryRepository();
    }

    //회원정보 입력 처리
    private static void makeNewBookUser() {
        System.out.println("\n# 회원정보를 입력해주세요");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = inputGender();

        // 입력받은 데이터 객체로 포장
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);

        // 입력받은 유저 객체를 저장소로 보내기

        repository.register(userInfo);

    }


    // 정확하게 성별을 입력 할때까지 반복 입력받는 메서드
    private static Gender inputGender() {
        while (true) {
            String inputGender = input("# 성별(M/F): ");
            Gender gender;

            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    return MALE;
                case 'F':
                    return FEMALE;
                default:
                    System.out.println("\n# 성별을 잘못 입력했습니다.");

            }
        }
    }

    // 화면 처리
    public static void start() {

        makeNewBookUser();

        // 메인 메뉴 띄우기
        while (true) {

            showMainScreen();

            selectMenu();

        }

    }


    // 메뉴 번호를 입력 받고 분기를 나눠주는 메서드
    private static void selectMenu() {
        String menuNum = input("- 메뉴 번호 :");

        switch (menuNum) {
            case "1":
                // 마이페이지 : 가입한 회원정보 출력
                // 정보내놔
                BookUser user = repository.findBookUser();
                System.out.println("\n******* 회원의 정보 *******");
                System.out.println("#회원명 : " + user.getName());
                System.out.println("#나이 : " + user.getAge());
                System.out.println("#성별 : " + user.getGenderToString());
                System.out.println("#쿠폰갯수 : " + user.getCouponCount());
                break;
            case "2":
                String[] infoList = repository.getBookInfoList();
                System.out.println("======= 모든 도서 정보 =======");
                for (String info : infoList) {
                    System.out.println(info);
                }
                break;

            case "3":
                // 사용자에게 검색어를 입력받는다
                String keyword = input("# 검색어: ");

                // 저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 내놓으라고 해야함
                String[] bookInfoList = repository.searchBookInfoList(keyword);
                if (bookInfoList.length > 0) {
                    System.out.printf("======== [%s] 검색 결과 ========\n", keyword);
                    for (String info : bookInfoList) {
                        System.out.println(info);
                    }
                } else {
                    System.out.println("\n# 검색 결과가 없습니다.");
                }

                break;
            case "4":
                // 대여 가능한 책의 리스트를 먼저 보여준다 리스트 앞에 n번째 도서라고 쓴다.
                String[] rentableInfoList = repository.getBookInfoList();
                System.out.println("======== 대여 도서 목록 ========");

                int bookNum = 1;
                for (String info : rentableInfoList) {
                    System.out.printf("%d. %s\n", bookNum++, info);
                }

                // 사용자로부터 도서 번호를 입력 받는다.
                String rentBookNum = input("- 대여할 도서 번호 입력: ");

                RentStatus rentStatus = repository.rentBook(Integer.parseInt(rentBookNum));

                if(rentStatus == RENT_SUCCESS_WITH_COUPON){
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                } else if (rentStatus == RENT_SUCCESS) {
                    System.out.println("# 도서가 성공적으로 대여되었습니다.");
                } else {
                    System.out.println("# 도서 대여에 실패했습니다");
                }
                // 조건을 검색한 후 가능하다면 "성공적으로 대여되었습니다. n 쿠폰이 발급 되었으니 마이 페이지에서 확인하세요"
                // library repository 에서 처리함,
                // 책에 쿠폰이 있다면 쿠폰을 coupon ++ 없다면 그냥 두면 된다.


                break;
            case "5":
                // 사용자로부터 저자이름을 입력 받는다.
                String authorName = input("# 저자이름 : ");

                // 저장소에게 해당 저자 이름을 주면 그 저자의 책을 받아보기
                String[] byAuthor = repository.searchBookByAuthor(authorName);
                if (byAuthor.length > 0) {
                    System.out.printf("====== [%s]님의 책 리스트 ======\n", authorName);
                    for (String bookList : byAuthor) {
                        System.out.println(bookList);
                    }
                } else {
                    System.out.println("해당 저자의 책은 없습니다.");
                }

                break;
            case "9":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;

            default:
                System.out.println("\n# 메뉴번호를 똑바로 입력하세요!");

        }


    }

    // 메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {

        System.out.println("============ 도서 메뉴 ============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 5. 도서 저자이름으로 검색");
        System.out.println("# 9. 프로그램 종료하기");


    }
}
