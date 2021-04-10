import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        byte row = scanner.nextByte();
        byte column = scanner.nextByte();
        short[][] array = new short[row][column];

        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < column; j++) {
                array[i][j] = scanner.nextShort();
            }
        }

        byte firstColumnIndex = scanner.nextByte();
        byte secondColumnIndex = scanner.nextByte();
        short temp = 0;

        for (byte i = 0; i < row; i++) {
            temp = array[i][firstColumnIndex];
            array[i][firstColumnIndex] = array[i][secondColumnIndex];
            array[i][secondColumnIndex] = temp;
        }

        for (short[] arr : array) {
            for (short arr2 : arr) {
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
    }
}