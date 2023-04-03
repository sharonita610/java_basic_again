package day04;


//댄서 설계도
// 설계도에는 main 을 만들지 않습니다
public class Dancer {

    // 속성(필드)
    String dancerName; // 댄서 이름
    
    
    String crewName; // 크루 이름
    
    
    String genre;// 춤 장르
    
    
    DanceLevel level; // 춤수준 (0:초보자, 1: 중수, 2:고수)


    // 생성자 : 스카우터, 개발자(공돌이), 기술자(생성자)
    // 생성자도 함수 개념, 리턴이 void 로 고정
    // 리턴 값은 생성한 객체의 리턴 값을 리턴
    // 객체 생성시 필요한 데이터를 셋팅
    Dancer(){
        dancerName = "갑돌이";
        crewName = "돌아이들";
        genre = "아이돌댄스";
        level = DanceLevel.AMATEUR;
    }
    // 생성자 오버로딩
    Dancer(String dgenre){
        dancerName = "관종킹";
        crewName = "서커스왕";
        genre = dgenre;
        level = DanceLevel.BEGINNER;
    }

    Dancer(String dName, String dGenre, DanceLevel dLevel){
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;
    }


    
    // 기능(메서드) : static을 붙이지 마세요

    // 춤추는 기능
    void dance(){
        System.out.println(genre +"춤을 열정적으로 춥니다");
    }

    // 스트레칭을 하는 기능
    void stretch(){
        System.out.println("몸을 유연하게 풉니다");
    }

    // 자기소개 기능
    String introduce(){
        return String.format("내 이름은 %s 이고, %s팀에 소속되어 있습니다", dancerName,crewName);
    }




}
