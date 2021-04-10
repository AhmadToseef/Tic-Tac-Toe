import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        byte row = scanner.nextByte();
        byte column = scanner.nextByte();
        short[][] array = new short[row][column];
        short[][] rotatedArray = new short[column][row];

        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < column; j++) {
                array[i][j] = scanner.nextShort();
            }
        }

        for (byte i = (byte) (row - 1); i >= 0; i--) {
            for (byte j = 0; j < column; j++) {
                rotatedArray[j][row - 1 - i] = array[i][j];
            }
        }

        for (short[] arr : rotatedArray) {
            for (short arr2 : arr) {
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
    }
}