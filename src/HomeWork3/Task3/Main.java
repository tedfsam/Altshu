package HomeWork3.Task3;

import java.util.Scanner;

/*
Программа должна считывать с консоли 3 целых числа.
1 число - это число, которое является началом последовательности.
2 число - это число, которое является концом последовательности.
3 число - это число для сверки кратности.
Логика программы:
После ввода чисел программа находит все целые числа в промежутке от 1-го до последнего включительно,
которые кратны 3-му числу и выводит их в строку через пробел на экран.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = console.nextInt();
        int finish = console.nextInt();
        int multiplicity = console.nextInt();
        for (int i = start; i <= finish; i++) {
            if (i % multiplicity == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
