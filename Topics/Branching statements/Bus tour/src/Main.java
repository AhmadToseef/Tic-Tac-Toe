import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int numbersOfPulls = scanner.nextInt();
        boolean willCrash = false;
        int i = 1;

        while (i++ <= numbersOfPulls) {
            if (scanner.nextInt() <= heightOfBus) {
                willCrash = true;
                break;
            }
        }

        System.out.println(willCrash ? "Will crash on bridge " + (i - 1) : "Will not crash");
    }
}