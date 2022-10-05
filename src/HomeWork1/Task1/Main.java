package HomeWork1.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How much do you contribute?");
        double sum = console.nextDouble();

        System.out.println("How long is your deposit?");
        int years = console.nextInt();

        System.out.println("Sum perсent");
        double percent = console.nextDouble();

        double result = 0.0;
        double nalog = 42500.0;
        double nalogSum = 0d;

        for (int i = 1; i <= years; i++) {
            result = result + (sum / 100 * percent);
            if (result > nalog) {
                nalogSum = ((result - nalog) / 100) * 13;
            }
            result -= nalogSum;
        }

        String resultToUser = String.format("For %d years you might get %.2f rubles", years, result);
        System.out.println(resultToUser);
    }
}
