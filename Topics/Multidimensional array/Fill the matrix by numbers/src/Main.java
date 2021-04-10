import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[][] array2d = new int[capacity][capacity];

        for (int i = 0; i < capacity;  i++) {
            for (int j = 0; j < capacity; j++) {
                array2d[i][j] = i - j;
            }
        }

        // Retrieving array
        for (int[] arr : array2d) {
            for (int arr2 : arr) {
                System.out.print(Math.abs(arr2) + " "); // used to remove - sign from value
            }
            System.out.println();
        }
    }
}