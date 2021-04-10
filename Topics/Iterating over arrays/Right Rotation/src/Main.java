import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int numberOfRotation = scanner.nextInt();
        String temp = "";
        numberOfRotation = numberOfRotation % str.length;

        for (int i = 0; i < numberOfRotation; i++) {
            for (int j = str.length - 1; j > 0; j--) {
                temp = str[j];
                str[j] = str[j - 1];
                str[j - 1] = temp;
            }
        }

        int i = 0;
        while (i < str.length) {
            System.out.print(str[i++] + " ");
        }

    }
}