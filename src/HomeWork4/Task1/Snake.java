package HomeWork4.Task1;

import java.util.Objects;

public class Snake implements Animal
//        ,        Comparable<Animal>
{
    private String type;
    private String name;

    public Snake(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public void tellMeWhoYouAre() {
        System.out.println("Type = " + getType() + ", Name = " + getName());
    }

    @Override
    public String toString() {
        return "Snake{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String nameAnimal() {
        return getName();
    }

}
