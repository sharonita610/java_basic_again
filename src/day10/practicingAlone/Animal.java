package day10.practicingAlone;

// 동물 등록을 위한 속성
public class Animal {

    private String type;
    private String name;
    private int age;
    private char gender;
    private int phoneNum;

    public Animal() {
    }

    public Animal(String type, String name, int age, char gender, int phoneNum) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
