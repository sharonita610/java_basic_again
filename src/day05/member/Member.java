package day05.member;

import java.time.LocalDate;

// 역할 : 한 명의 회원 정보를 묶어주는 역할
// Java Bean
public class Member {
    // 필드
    String email;
    String password;
    String memberName;
    int memberId;
    Gender gender; // 열거형 타입, 고정값일때 CAP LETTER 로 쓰게 됨 . ENUM
    int age;


    LocalDate regDate;
    //생성자

    public Member(String email, String password, String memberName, int memberId, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.memberId = memberId;
        this.gender = gender;
        this.age = age;
    }


    // 회원의 정보를 문자열로 만들어서 리턴하는 기능

    String inform(){
        String convertGender = (gender ==gender.MALE) ? "남성" : "여성"; // enum 에서 온 값을 바꾸는 장법
        
        return String.format("# %d번 | %s | %s | %s | %d세"
                            ,this.memberId, this.email, this.memberName, convertGender, this.age);

    }
}
