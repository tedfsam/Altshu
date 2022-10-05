package HomeWork2.Task3;
/**
 * Задача 3
 * Написать программу, которая считывает с консоли два числа, инициализирует двумерный массив, с размерностью этих чисел.
 * Считывает с консоли числа по колличеству ячеек массива.
 * После этого сортирует массив последовательно построчно по возрастанию и выводит на консоль его в обратном порядке(от меньшего к большему).
 * Пример ввода:
 * ввод:
 * 2
 * ввод:
 * 4
 * введенный массив:
 * 2
 * 4
 * 7
 * 8
 * 10
 * 1
 * 15
 * 3
 * Выведенный массив:
 * 15 10 8 7
 * 4  3  2 1
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int countArr = console.nextInt();
        int countArr2 = console.nextInt();
        int[][] array = new int[countArr][countArr2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = console.nextInt();
            }
        }

        for (int[] ints : array) {
            Arrays.sort(ints);
            for (int j = array[0].length - 1; j >= 0; j--) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
