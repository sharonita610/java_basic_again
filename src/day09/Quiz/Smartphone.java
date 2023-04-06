package day09.Quiz;

public abstract class Smartphone implements Camera, PhoneCall {

    private String model;

    public abstract String information();

    public abstract String charge();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
