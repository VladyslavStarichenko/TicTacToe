package ua.com.alevel.models;

public class Logic {

    public static boolean checkForMovement(char[][] gameBoard, int[] position) {
        if (position[0] == 1) {
            switch (position[1]) {
                case 1:
                    return (gameBoard[0][0] == ' ');
                case 2:
                    return (gameBoard[0][2] == ' ');
                case 3:
                    return (gameBoard[0][4] == ' ');
            }
        }
        if (position[0] == 2) {
            switch (position[1]) {
                case 1:
                    return (gameBoard[2][0] == ' ');
                case 2:
                    return (gameBoard[2][2] == ' ');
                case 3:
                    return (gameBoard[2][4] == ' ');
            }
        }
        if (position[0] == 3) {
            switch (position[1]) {
                case 1:
                    return (gameBoard[4][0] == ' ');
                case 2:
                    return (gameBoard[4][2] == ' ');
                case 3:
                    return (gameBoard[4][4] == ' ');
            }
        }
        return false;
    }

    public static void movement(char[][] gameBoard, int positionX, int positionY, char sign) {
        if (positionX == 1) {
            switch (positionY) {
                case 1 -> gameBoard[0][0] = sign;
                case 2 -> gameBoard[0][2] = sign;
                case 3 -> gameBoard[0][4] = sign;
            }
        }
        if (positionX == 2) {
            switch (positionY) {
                case 1 -> gameBoard[2][0] = sign;
                case 2 -> gameBoard[2][2] = sign;
                case 3 -> gameBoard[2][4] = sign;
            }
        }
        if (positionX == 3) {
            switch (positionY) {
                case 1 -> gameBoard[4][0] = sign;
                case 2 -> gameBoard[4][2] = sign;
                case 3 -> gameBoard[4][4] = sign;
            }
        }
    }

    public static boolean checkForCombination(char[][] board, char symbol1, char symbol2) {
        if (winForPlayer(board, symbol1)) {
            playerWin(board);
            return true;
        }
        if (winForPlayer(board, symbol2)) {
            computerWin(board);
            return true;
        }

        if (tieCombination(board)){
            tieGameCombination(board);
            return  false;
        }
        return true;
    }

    public static boolean tieCombination(char[][] board) {
        for (char[] row : board) {
            for (char element : row) {
                if (element == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winForPlayer(char[][] board, char symbol) {
        return (firstRowCombination(board, symbol) ||
                secondRowCombination(board, symbol) ||
                thirdRowCombination(board, symbol) ||
                firstColumnCombination(board, symbol) ||
                secondColumnCombination(board, symbol) ||
                thirdColumnCombination(board, symbol) ||
                rightDiagonalCombination(board, symbol)
                || leftDiagonalCombination(board, symbol));
    }

    public static boolean firstRowCombination(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[0][2] == symbol && board[0][4] == symbol);
    }

    public static boolean secondRowCombination(char[][] board, char symbol) {
        return (board[2][0] == symbol && board[2][2] == symbol && board[2][4] == symbol);
    }

    public static boolean thirdRowCombination(char[][] board, char symbol) {
        return (board[4][0] == symbol && board[4][2] == symbol && board[4][4] == symbol);
    }

    public static boolean firstColumnCombination(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[2][0] == symbol && board[4][0] == symbol);
    }

    public static boolean secondColumnCombination(char[][] board, char symbol) {
        return (board[0][2] == symbol && board[2][2] == symbol && board[4][2] == symbol);
    }

    public static boolean thirdColumnCombination(char[][] board, char symbol) {
        return (board[0][4] == symbol && board[2][4] == symbol && board[4][4] == symbol);
    }

    public static boolean rightDiagonalCombination(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[2][2] == symbol && board[4][4] == symbol);
    }

    public static boolean leftDiagonalCombination(char[][] board, char symbol) {
        return (board[4][0] == symbol && board[2][2] == symbol && board[0][4] == symbol);
    }


    private static void playerWin(char[][] board) {
        Board.printBoard(board);
        System.out.println("Congratulation, you're win!");
    }

    private static void computerWin(char[][] board) {
        Board.printBoard(board);
        System.out.println("Ups, computer win!");
    }

    private static void tieGameCombination(char[][] board) {
        Board.printBoard(board);
        System.out.println("End of game. It's a tie game!");
    }
}
