package HomeWork4.Task1;
/*
Написать программу, которая выводит на консоль «введите тип тип животного».
После этого считывает с консоли слово, которое является названием типа: Cow, Cat, Dog, Snake.
После этого считывает с консоли имя животного.
В программе должны быть описаны классы отвечающие за конкретный тип.
Все они должны быть импелементаторами интерфейса Animal.
У интерфейса Animal должен быть один абстрактный void метод tellMeWhoYouAre(), который выводит на консоль Тип животного и его имя.
В методе main необходимо реализовать логику,
согласно которой на основании введенных данных при помощи switch-case блока создается объект животного со введенными параметрами.
Программа выполняет считывание животных до тех пор, пока с консоли не ввели «Достаточно».
После этого программа выводит на экран в строку животных с одинаковыми именами и их типы.
*/

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите тип животного");
        Scanner console = new Scanner(System.in);
        ArrayList<Animal> animalList = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Animal> printList = new ArrayList<>();

        while (!console.hasNext("Достаточно")) {
            String animalType = console.nextLine().trim();
            String animalName = console.nextLine().trim();

            switch (animalType.toLowerCase()) {
                case "cow":
                    animalList.add(new Cow(animalType, animalName));
                    break;
                case "cat":
                    animalList.add(new Cat(animalType, animalName));
                    break;
                case "dog":
                    animalList.add(new Dog(animalType, animalName));
                    break;
                case "snake":
                    animalList.add(new Snake(animalType, animalName));
                    break;
            }
        }

        for (Animal a : animalList) {
            arrayList.add(a.nameAnimal());
        }

        for (Animal a : animalList) {
            int countFreq = Collections.frequency(arrayList, a.nameAnimal());
            if (countFreq > 1) {
                a.tellMeWhoYouAre();
            }
        }
    }
}
