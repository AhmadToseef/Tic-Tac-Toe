import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        byte number;

        do {
            number = scanner.nextByte();
            if (number != 0) {
                System.out.println(number % 2 == 0 ? "even" : "odd");
            } else {
                break;
            }
        } while (true);
    }
}