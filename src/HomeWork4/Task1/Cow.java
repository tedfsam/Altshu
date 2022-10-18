package HomeWork4.Task1;

import java.util.Objects;

public class Cow implements Animal
//        ,        Comparable<Animal>
{
    private String type;
    private String name;

    public Cow(String type, String name) {
        this.name = name;
        this.type = type;
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
    public String nameAnimal() {
        return getName();
    }

}
