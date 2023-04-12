package day13;

import day13.Dish.Type;

public class DishDish {

    private final String name;
    private final Type type;

    public DishDish(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }



    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DishDish{" +
                "name='" + name + '\'' +

                ", type=" + type +
                '}';
    }
}
