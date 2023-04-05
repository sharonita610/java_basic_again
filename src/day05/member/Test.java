package day05.member;

public class Test {

    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();


        Member thief = new Member("uuu@def.com", "3210", "밥도둑"
                , 4, Gender.FEMALE, 22);

        mr.addMember(thief);
        mr.addMember(thief);

        mr.showMembers();


        boolean flag = mr.isDuplicateEmail("uuu@def.com");
        System.out.println(flag);


        String targetEmail = "abc@def.com";
        // 수정 테스트

        boolean updateFlag = mr.changePassword(targetEmail, "9999");

        if (updateFlag){

//            String updateMember = mr.findByEmail(targetEmail).inform();
//            System.out.println("updateMember = " +updateMember);
//
            Member updateMember = mr.findByEmail(targetEmail);
            System.out.println("updateMember = " +updateMember.password);

//            위에 두코드는 같은 것을 조회하고 수정함. 하나는 email 주인 전체 정보 보이고, 다른 하나는 비번이 보임

        } else {
            System.out.println("이메일이 잘못됨");
        }

        System.out.println("===================================");
        mr.showMembers();
        mr.removeMember("xxx@def.com");
        mr.removeMember("hyg@def.com");
        mr.removeMember("abc@def.com");
        mr.showMembers();




    }











}
