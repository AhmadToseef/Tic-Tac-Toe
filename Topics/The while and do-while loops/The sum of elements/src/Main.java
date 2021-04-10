import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num; // default value is 0
        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(sum);
    }
}