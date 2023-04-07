package friends;

import java.util.List;

public class test {
    public static void main(String[] args) {

        People kim = new People("김철수");
        People park = new People("박영희");
        People hong = new People("홍길동");
        
        kim.addFollowerWaitList(park);
        kim.addFollowerWaitList(hong);

        kim.addFollower(park);

        park.addFollowerWaitList(kim);
        park.addFollower(kim);

        List<String> kimWaitList = kim.showFollowerWaitPerson();
        System.out.println("kimWaitList = " + kimWaitList);

        List<String> kimfollowerNames = kim.showFollower();
        System.out.println("kimfollowerNames = " + kimfollowerNames);

        List<String> parkWaitList = park.showFollowerWaitPerson();
        System.out.println("parkWaitList = " + parkWaitList);
        
        List<String> parkfollowerNames = park.showFollower();
        System.out.println("parkfollowerNames = " + parkfollowerNames);
        
    }
}
