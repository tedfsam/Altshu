package HomeWork3.Task1;
/*
Программа должна выводить на консоль «Введите количество чисел, которые будете считывать»
После этого программа считывает с консоли указанное количество чисел и выводит на экран через пробел группы тех из них, которые равны между собой.
А затем выводит в строку уникальные числа.
Пример:
Введите количество чисел, которые будете считывать:
7
Вводимые числа:
7, 3, 5, 6, 3, 7, 6
Выводимый результат:
7 7
3 3
6 6
Уникальные числа: 5
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел, которые будете считывать");
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        StringBuilder pair = new StringBuilder();
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int j = console.nextInt();
            if (list.contains(j)) {
                set.add(j);
            }
            list.add(j);
        }

        for (Integer key : set) {
            int countFreq = Collections.frequency(list, key);
            if (countFreq > 1) {
                for (int i = 0; i < countFreq; i++) {
                    pair.append(key);
                    pair.append(" ");
                }
                pair.append("\n");
            }
        }

        for (Integer intUniq : list) {
            if (!set.contains(intUniq)) {
                unique.append(intUniq);
                unique.append(" ");
            }
        }

        System.out.println("Парные числа:\n" + pair);
        System.out.println("Уникальные числа: " + unique);
    }
}

