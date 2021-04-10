//package tictactoe;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter cells: ");
//        String gameState = new String(scanner.nextLine());
//        String[][] gameArray = new String[3][3];
//        int index = 0;
//        System.out.println(" --------- ");
//        System.out.println(" | " + gameState.charAt(0) + " " + gameState.charAt(1) + " " + gameState.charAt(2) + " | ");
//        System.out.println(" | " + gameState.charAt(3) + " " + gameState.charAt(4) + " " + gameState.charAt(5) + " | ");
//        System.out.println(" | " + gameState.charAt(6) + " " + gameState.charAt(7) + " " + gameState.charAt(8) + " | ");
//        System.out.println(" --------- ");
//        byte[] count = new byte[9];
//        byte x = 0;
//        byte o = 0;
//        boolean xResult = false;
//        boolean oResult = false;
//        boolean gameNotFinished = false;
//        boolean draw = false;
//        byte emptyCell = 0;
//
//        // inserting value to array
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                gameArray[i][j] = String.valueOf(gameState.charAt(index));
//                ++index;
//            }
//        }
//
//        // checking first row
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//
//        // checking center row
//        for (int i = 1; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X")) {
//                    ++x;
//                } else if (gameArray[i][j].toUpperCase().equals("O")) {
//                    ++o;
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//
//        // checking bottom row
//        for (int i = 2; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X")) {
//                    ++x;
//                } else if (gameArray[i][j].toUpperCase().equals("O")) {
//                    ++o;
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//
//        // checking left diagonal
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = i; j < i + 1; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//        // checking right diagonal
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 2 - i; j >= 2 - i; j--) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//
////      checking first column
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 1; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X")) {
//                    ++x;
//                } else if (gameArray[i][j].toUpperCase().equals("O")) {
//                    ++o;
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
////        // checking second column
//        for (int i = 0; i < 3; i++) {
//            for (int j = 1; j < 2; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X")) {
//                    ++x;
//                } else if (gameArray[i][j].toUpperCase().equals("O")) {
//                    ++o;
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//
//        // checking last column
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 2; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && !oResult) {
//            System.out.println("X wins");
//            System.exit(0);
//        } else if (oResult && !xResult) {
//            System.out.println("O wins");
//            System.exit(0);
//        }
//
//        // impossible
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//        emptyCell = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (x > o || o > x && emptyCell > 0) {
//            System.out.println("Impossible");
//            System.exit(0);
//        }
//
//
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//        emptyCell = 0;
//        // checking game not finished
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                    o = 0;
//                    x = 0;
//                    xResult = false;
//                    oResult = false;
//                }
//            }
//        }
//
//        if (!xResult && !oResult && emptyCell > 0) {
//            System.out.println("Game not finished");
//        }
//
//
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//        emptyCell = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 1; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 1; j < 2; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 2; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                }
//            }
//        }
//
//        if (xResult && oResult && emptyCell > 0 || emptyCell == 0) {
//            System.out.println("Impossible");
//        } else if (!xResult && !oResult && emptyCell > 0 && x > o || o > x) {
//            System.out.println("Impossible");
//        }
//
//
//        // checking draw
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//        emptyCell = 0;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                    x = 0;
//                    o = 0;
//                }
//            }
//            x = 0;
//            o = 0;
//        }
//        if (!xResult && !oResult && emptyCell == 0) {
//            System.out.println("Draw");
//        }
//
//
//        // checking impossible
//        x = 0;
//        o = 0;
//        xResult = false;
//        oResult = false;
//        emptyCell = 0;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (gameArray[i][j].toUpperCase().equals("X") && x < 3) {
//                    ++x;
//                    o = 0;
//                    if (x == 3) {
//                        xResult = true;
//                    }
//                } else if (gameArray[i][j].toUpperCase().equals("O") && o < 3) {
//                    ++o;
//                    x = 0;
//                    if (o == 3) {
//                        oResult = true;
//                    }
//                } else {
//                    ++emptyCell;
//                    x = 0;
//                    o = 0;
//                }
//            }
//            x = 0;
//            o = 0;
//        }
//        if (xResult && oResult && emptyCell > 0) {
//            System.out.println("Impossible");
//        }
//    }
//}



package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int number = 1;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input = "_________"; // for empty grid
        displayEmptyGrid();
        enterCoordinates(scanner, input); // getting cordinates value x and y
    }

    static String printResult(String s) {
        String message = "123";

        if (checkY(s)) {
            message = "O wins";
        }

        if (checkX(s)) {
            message = "X wins";
        }

        if (checkNotFinished(s)) {
            message = "Game not finished";
        }
        if (checkDraw(s)) {
            message = "Draw";
        }

        if (checkImpossible(s)) {
            message = "Impossible";
        }

        return message;
    }

    static void enterCoordinates(Scanner scanner, String input) {
        System.out.print("Enter the coordinates: ");
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            firstMove(input, x - 1, y - 1); // Pass x any as a argument for coordinates
        } catch (InputMismatchException exception) {
            System.out.println("You should enter numbers!");
            enterCoordinates(new Scanner(System.in), input);
        }
    }

    static boolean checkEmpty (String s){
        boolean check = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '_') {
                check = true;
                break;
            }
        }

        return check;
    }

    static boolean checkNotFinished (String s){
        boolean check = false;

        if (!checkX(s) && !checkY(s) && checkEmpty(s)) {
            check = true;
        }

        return check;
    }

    static boolean checkDraw (String s){
        boolean check = false;

        if (!checkX(s) && !checkY(s) && !checkEmpty(s)) {
            check = true;
        }

        return check;
    }

    static boolean checkX (String s){
        boolean check = false;

        for (int i = 0; i < s.length() - 3; i += 3) {
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'X' && s.charAt(i + 2) == 'X') {
                check = true;
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'X' && s.charAt(i + 3) == 'X' && s.charAt(i + 6) == 'X') {
                check = true;
                break;
            }
        }

        if (s.charAt(0) == 'X' && s.charAt(4) == 'X' && s.charAt(8) == 'X') {
            check = true;
        }

        if (s.charAt(2) == 'X' && s.charAt(4) == 'X' && s.charAt(6) == 'X') {
            check = true;
        }

        return check;
    }

    static boolean checkY (String s){
        boolean check = false;

        for (int i = 0; i < s.length() - 3; i += 3) {
            if (s.charAt(i) == 'O' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'O') {
                check = true;
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'O' && s.charAt(i + 3) == 'O' && s.charAt(i + 6) == 'O') {
                check = true;
                break;
            }
        }

        if (s.charAt(0) == 'O' && s.charAt(4) == 'O' && s.charAt(8) == 'O') {
            check = true;
        }

        if (s.charAt(2) == 'O' && s.charAt(4) == 'O' && s.charAt(6) == 'O') {
            check = true;
        }

        return check;
    }

    static boolean checkImpossible (String s){
        boolean check = false;
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                countX++;
            } else if (s.charAt(i) == 'O') {
                countY++;
            }
        }

        if ((countX >= countY + 2 || countY >= countX + 2) || (checkX(s) && checkY(s))) {
            check = true;
        }

        return check;
    }

    static void printGrid (String s){
        String line = "---------";
        System.out.println(line);
        System.out.printf("| %s %s %s |\n", s.charAt(0), s.charAt(1), s.charAt(2));
        System.out.printf("| %s %s %s |\n", s.charAt(3), s.charAt(4), s.charAt(5));
        System.out.printf("| %s %s %s |\n", s.charAt(6), s.charAt(7), s.charAt(8));
        System.out.println(line);
    }

    static String[][] insertingToArray(String s) {
        String[][] gameArray = new String[3][3];
        int index = 0;
        // inserting value to array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameArray[i][j] = String.valueOf(s.charAt(index));
                ++index;
            }
        }
        return gameArray;
    }

    static void displayGrid(String[][] gameArray) {
        String s = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += gameArray[i][j];
            }
        }
        printGrid(s);
        String result = printResult(s);
        if (result.equals("X wins") || result.equals("O wins") || result.equals("Draw")) {
            System.out.println(result);
            System.exit(0);
        }

        enterCoordinates(new Scanner(System.in), s);
    }

    static void firstMove(String s, int x, int y) { // inserting x or O according to coordinate

        String[][] gameArray = insertingToArray(s);
        while (true) {
            if (x < 3 && y < 3) { // checking coordinate is not going to outofbound
                if (gameArray[x][y].equals(" ") || gameArray[x][y].equals("_")) {
                    if (number == 3) { // number = 1
                        number  = 1;
                    }
                    switch (number) { // according to number value
                        case 1:
                            number++; // number become 2
                            gameArray[x][y] = "X";
                            displayGrid(gameArray);
                            System.exit(0);
                            break;
                        case 2:
                            number++; // number become 3
                            gameArray[x][y] = "O";
                            displayGrid(gameArray);
                            System.exit(0);
                            break;
                    }

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    enterCoordinates(new Scanner(System.in), s);
                }
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
                enterCoordinates(new Scanner(System.in), s);
            }
        }
    }

    static void displayEmptyGrid() {
        printGrid("_________");
    }
}
