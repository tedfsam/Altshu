package HomeWork1.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] array = new int[console.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        int[] arrayCopy = new int[array.length];
        for (int i = 1; i < arrayCopy.length - 1; i++) {
            arrayCopy[i] = array[i - 1] + array[i] + array[i + 1];
        }

        arrayCopy[0] = array[0] + array[1];
        arrayCopy[arrayCopy.length - 1] = array[array.length - 1] + array[array.length - 2];

        System.out.println(Arrays.toString(arrayCopy));
    }
}
