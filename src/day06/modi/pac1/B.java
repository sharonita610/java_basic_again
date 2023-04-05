package day06.modi.pac1;

class B { // default 제한 : class 에서는 public과 default만 사용 가능
    // 클래스에서 default로 제한을 걸어버리면 패키지가 다른 곳에서 제한이 걸려서 사용 불가능해진다

    public int x1;
    int x2;
    private int x3;







    void test(){

        A a = new A(); // public

        new A(10); // default
//        new A("zzzzz"); // private



        a.f1 = 1; // public이라  다른 클래스에서 사용 가능함
        a.f2 = 2; // default는 동일 패키지 안에서는 사용 가능함
//        a.f3 = 3; // private 이기 때문에 제한됨


        a.m1(); // public
        a.m2(); // default
//        a.m3(); // private
    }


}
