package HomeWork2.Task2;
/**
 * Задача 2
 * Написать программу, которая выводит на экран "Что бы поделать?" считывает с консоли строку с названием дела.
 * Выводит циклично на консоль "Что бы еще поделать?" и считывает строку
 * до тех пор пока строка содержит фразу "Ничего не делай".
 * В таком случае метод выводит на консоль "Пойду бездельничать" и завершается.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Что бы поделать?");
        String stringUser = console.nextLine().toLowerCase();
        do {
            System.out.println("Что бы еще поделать?");
        } while (!(console.nextLine().toLowerCase().equalsIgnoreCase("Ничего не делай")));
        System.out.println("Пойду бездельничать");
    }
}
