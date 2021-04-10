import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long facto = 1L;
        int i = 0;
        do {
            i += 1;
        } while ((facto *= i) <= number);
        System.out.println(i);
    }
}