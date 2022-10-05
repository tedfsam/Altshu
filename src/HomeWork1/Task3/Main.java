package HomeWork1.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            arrayList.add(console.nextInt());
        }

        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }

        ArrayList<Integer> listFib = new ArrayList<>();
        listFib.add(1);
        listFib.add(1);
        for (int i = 0; max > listFib.get(listFib.size() - 1); i++) {
            listFib.add(listFib.get(i) + listFib.get(i + 1));
        }

        StringBuilder strFib = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (Integer i : arrayList) {
            if (listFib.contains(i)) {
                strFib.append(i).append("\t");
            } else {
                str.append(i).append("\t");
            }
        }

        System.out.println("Fibonacci sequence numbers: " + strFib);
        System.out.println("Fibonacci off-sequence numbers: " + str);
    }
}
