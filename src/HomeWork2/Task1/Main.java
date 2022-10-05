package HomeWork2.Task1;
/**
 * Задача 1
 * Написать программу, в которой метод main вызывает метод exceptional().
 * Метод еxceptional следует реализовать следующим образом:
 * Метод циклично выполняет следующие действия:
 * 1)Выводит на консоль "Введите строку".
 * 2)Считывает считывает с консоли строку.
 * 3)Выводит на консоль "Давай попробуем снова".
 * Этот набор действий выполняется до тех пор, пока считанная строка
 * приведенная к нижнему регистру, не содержит текст "отстань от меня, пожалуйста".
 * В таком случае метод выбрасывает исключение, ловит его и выводит на консоль "Ха-ха! Попался! я поймал исключение".
 * После этого метод выводит "До свидания" и завершается. Выполнение программы заканчивается.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        exceptional();
    }

    public static void exceptional() {
        System.out.println("Введите строку");
        Scanner console = new Scanner(System.in);
        String stringUser = console.nextLine().toLowerCase();
        try {
            do {
                System.out.println("Давай попробуем снова");
            } while (!(console.nextLine().toLowerCase().equals("отстань от меня, пожалуйста")));
            throw new CatchException("Ха-ха! Попался! я поймал исключение");
        } catch (CatchException e) {
            System.out.println(e.getMessage());
            System.out.println("До свидания");
        }
    }

    public static class CatchException extends Exception {
        public CatchException(String message) {
            super(message);
        }
    }
}
