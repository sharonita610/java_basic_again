package day05.member;

// 역할 : 회원 저장소 역할

import java.time.LocalDate;

public class MemberRepository {
//        psf

    public static final int NOT_FOUND = -1;

    Member[] memberList;

    //삭제된 회원 배열
//    Member[]

    public MemberRepository() {
        this.memberList = new Member[3];

        memberList[0] = new Member("abc@def.com", "1234", "콩벌레"
                , 1, Gender.MALE, 50);
        memberList[1] = new Member("xxx@def.com", "5678", "팥죽이"
                , 2, Gender.FEMALE, 30);
        memberList[2] = new Member("hyg@def.com", "0000", "카레왕"
                , 3, Gender.MALE, 44);
    }

    /**
     * 모든 회원 정보를 출력해주는 메서드
     */

    void showMembers() {
        System.out.printf("======== 현재 회원 정보 (총 %d명) ========\n", memberList.length);

        for (Member m : memberList) {
            System.out.println(m.inform());
        }

    }

    /**
     * 회원 가입하는 기능
     *
     * @param - newMember : 새롭게 회원 가입하는 회원의 정보
     * @return : 회원가입 성공 여부
     * 성공시 true, 이메일이 중복되어 실패시 false
     */


    boolean addMember(Member newMember) {

        // 이메일이 중복인가?
        if (isDuplicateEmail(newMember.email)) return false;

        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }

        // 회원 가입 시간 등록
        newMember.regDate = LocalDate.now();

        temp[temp.length - 1] = newMember;
        memberList = temp;

        return true;
    }

    /*
     * 이메일의 중복 여부를 확인하는 지능
     * @param1 targetEmail : 검사대상 이메일
     * @return : 중복되었을 시 true,  사용 가능 할 시 false
     * */

    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }


    // 마지막 회원의 번호를 알려주는 기능
    int getLastMemberID() {
        return memberList[memberList.length - 1].memberId;
    }

    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @return : 찾은 회원의 객체정보, 못찾으면 null반환
     * @param1 email : 찾고 싶은 회원의 이메일
     */
    Member findByEmail(String email) {
        for (Member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }

    /**
     * 이메일을 통해 저장된 회원의 인덱스 값을 알아내는 메서드
     *
     * @param email - 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1 리턴
     */
    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email)) {
                return i;
            }
        }
        return NOT_FOUND; // 맨 처음에 등록한 상수값.

//        return 0; // 기본으로 이렇게 달아놓고 다른 일 하다가 와서 수정하면 됨
    }

    /**
     * 비밀번호를 수정하는 기능
     *
     * @param email       : 수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */

    boolean changePassword(String email, String newPassword) {

        //인덱스 탐색
        int index = findIndexByEmail(email);

        // 수정 진행
        if (index == NOT_FOUND) {
            return false;
        } else {
            memberList[index].password = newPassword;
            return true;
        }
    }


    void removeMember(String email) {
        //인덱스 찾기
        int findIndex = findIndexByEmail(email);


        for (int i = findIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }


        // 앞으로 땡기기
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
        temp = null;
    }
        //마지막 칸 없애기




}
