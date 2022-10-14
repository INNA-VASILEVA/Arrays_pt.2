import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int[] totalMoneyMonth = new int[30];
        for (int i = 0; i < totalMoneyMonth.length; i++) {
            totalMoneyMonth[i] = ((int) (Math.random() * 100_000) + 200_000 - 100_000);
            System.out.print(totalMoneyMonth[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < totalMoneyMonth.length; i++) {
            sum = sum + totalMoneyMonth[i];
        }
        System.out.println("\n" + "Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        int max = 100_000;
        for (int i : totalMoneyMonth) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        int min = 200_000;
        for (int i : totalMoneyMonth) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        //Задание 3
        System.out.println("Задание 3");
        double average = 0;
        if (totalMoneyMonth.length > 0) {
            double sum2 = 0;
            for (int i = 0; i < totalMoneyMonth.length; i++) {
                average += totalMoneyMonth[i];
            }
            average = average / totalMoneyMonth.length;
        }
        System.out.println("Средняя сумма трат за месяц " + average + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>=0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }