package day13;
// static final = 상수, 모든 요리의 이름은 다 같아야되고 못바꿈,
// 그냥 final만 들어가면 다를 수는 있다, 한 번 정해지면 못바꿈
public class Dish {

    private final String name; // 요리 이름
    private final boolean vegeterian; // 채식주의 여부
    private final int calories; // 칼로리
    private final Type type; // 요리 카테고리


    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public enum Type{
        MEAT, FISH, OTHER
    }

}
