package day09.Quiz;

public class Galaxy extends Smartphone implements Pencil{

    public Galaxy(String model) {
        this.getModel();

    }

    @Override
    public String information() {
        System.out.printf("갤럭시는 %s에서 만들어졌고 제원은 다음과 같다.\n", getModel());
        return  makeCall();

    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전"+ bluethoothPen();
    }

    @Override
    public String takePicture() {

        return "1300만 듀얼 카메라\n" + charge();
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n" + takeCall();
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름\n" + takePicture();
    }

    @Override
    public boolean bluethoothPen() {
        if(true)
        System.out.println("정전식, 와콤펜 지원\n블루투스 펜 탑재 여부 : "+true);
        return true;
    }
}
