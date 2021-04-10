import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int number = 0;
        boolean result = false;
        boolean assending = true;
        boolean dessending = true;
        int loopCount = 0;

        while ((number = scanner.nextInt()) != 0) {
            if (dessending && start > number) {
                start = number;
                result = true;
                assending = false;
            } else if (dessending) {
                result = false;
            }

            if (assending && start < number) {
                start = number;
                result = true;
                dessending = false;
            } else if (assending) {
                result = false;
            }

            if (start == number) {
                result = true;
            }
            ++loopCount;
        }

        System.out.println(loopCount <= 0 || result); // this is for 
    }
}