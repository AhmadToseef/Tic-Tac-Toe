import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] totalAmountOfCompanies = new int[numberOfCompanies];
        int[] payedTexes = new int[numberOfCompanies];

        for (int i = 0; i < totalAmountOfCompanies.length; i++) {
            totalAmountOfCompanies[i] = scanner.nextInt();
        }

        for (int i = 0; i < totalAmountOfCompanies.length; i++) {
            payedTexes[i] = scanner.nextInt();
        }

        int[] result = new int[numberOfCompanies];
//        part = whole * percentage / 100;
        for (int i = 0; i < totalAmountOfCompanies.length; i++) {
            result[i] = totalAmountOfCompanies[i] * payedTexes[i];
        }

        // find highly payed company
        int value = result[0];
        int index = 1;
        for (int i = 0; i < result.length - 1; i++) {
            if (value < result[i + 1]) {
                value = result[i + 1];
                index = i + 2;
            }
        }
        System.out.println(index);
    }
}