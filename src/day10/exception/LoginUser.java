package day10.exception;

public class LoginUser {

    String userAccount; // 가입된 계정명
    String userPassword; // 가입시 설정한 패스워드

    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword) throws Exception {

        // 회원 계정이 존재하는가?

        if (userAccount.equals(inputAccount)) {
            // 패스워드가 일치하는가?
            if (userPassword.equals(inputPassword)) {
                // 로그인 성공
                return "Success!";
            } else {
                // 패스워드가 틀림
                throw new Exception("비밀번호 똑바로 치세요오");
            }
        } else {
            // 계정 정보가 틀림
            throw new Exception("회원가입부터 하세요오");

        }

    }


}
