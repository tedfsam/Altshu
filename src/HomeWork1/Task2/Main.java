package HomeWork1.Task2;

public class Main {
    public static void main(String[] args) {
        int countFib = 7;

        int count1 = 1;
        int count2 = 1;
        int count3;

        StringBuilder str = new StringBuilder();
        str.append(count1).append("\t").append(count2);
        for (int i = 3; i <= countFib; i++) {
            count3 = count1 + count2;
            str.append("\t").append(count3);
            count1 = count2;
            count2 = count3;
        }
        System.out.print(str);
    }
}
