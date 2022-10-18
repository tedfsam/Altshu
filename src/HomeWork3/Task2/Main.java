package HomeWork3.Task2;
/*
Программа должна считывать с консоли 3 числа.
Числа являются длинами сторон треугольника.
Программа должна определять возможность существования треугольника с указанными сторонами.
Для этого необходимо:
Сравнить длину стороны треугольника с суммой двух других
Если каждая сторона меньше суммы двух других, то такой треугольник существует.
Если нет, то такой треугольник не существует.
Результатом работы программы должна быть выведенная на экран одна из 2 фраз:
1)«Треугольник существует»
2)«Треугольник существует
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i1 = console.nextInt();
        int i2 = console.nextInt();
        int i3 = console.nextInt();
        if (isExist(i1, i2, i3) && isExist(i3, i2, i1) && isExist(i2, i1, i3)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }

    public static boolean isExist(int a, int b, int c) {
        return a <= b + c;
    }
}
