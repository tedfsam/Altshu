package HomeWork2.Task4;

/**
 * Задание 4
 * Написать программу, которая считывает с консоли число, а затем считывает с консоли количество слов равное этому числу. Слова необходимо поместить в ArrayList.
 * Записывает в отдельный ArrayList те слова из исходного списка, которые являются  анаграммами.
 * Записывает в отдельный ArrayList те слова из исходного списка, которые не являются  анаграммами.
 * Выводит на консоль «Анаграммы" и вслед за этим в одну строку те слова, которые хранятся в списке анаграмм.
 * Выводит на консоль "Не анаграммы" и вслед за этим в одну строку те слова, которые хранятся в списке для не анаграмм.
 * <p>
 * Анаграммы – это слова, у которых одни и те же буквы в одинаковом количестве, но располагающиеся в разном порядке.
 * <p>
 * Примеры анаграмм:
 * лунь
 * нуль
 * воз
 * зов
 * чертог
 * горечь
 * соль
 * лось
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int arrayListCount = console.nextInt();
        ArrayList<String> listString = new ArrayList<>();
        HashMap<String, Integer> hashAndString = new HashMap<>();

        for (int i = 0; i < arrayListCount; i++) {
            listString.add(i, new Scanner(System.in).nextLine().toLowerCase());
            int sumHash = 0;
            char[] temp = listString.get(i).toCharArray();
            for (char c : temp) {
                sumHash += c;
            }
            hashAndString.put(listString.get(i), sumHash);
        }

        ArrayList<String> listAnagram = new ArrayList<>();
        ArrayList<String> listNotAnagram = new ArrayList<>();

        for (String s : listString) {
            int count = 0;
            for (Integer iValue : hashAndString.values()) {
                if (Objects.equals(hashAndString.get(s), iValue)) {
                    count++;
                }
            }
            if (count > 1) {
                listAnagram.add(s);
            } else {
                listNotAnagram.add(s);
            }
        }

        System.out.println("Анаграммы: ");
        for (String str : listAnagram) {
            System.out.print(str + "\t");
        }

        System.out.println("\nНе анаграммы: ");
        for (String str : listNotAnagram) {
            System.out.print(str + "\t");
        }
    }
}
