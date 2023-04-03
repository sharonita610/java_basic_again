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

    }

}
