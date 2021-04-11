package ua.com.alevel.models;

public class Board {
    private static final Character PIPE = '|';
    private static final Character SHARP = '+';
    private static final Character WHITESPACE = ' ';
    private static final Character WALL = '-';

    public static char[][] createBoard(int dimension) {
        int realDIMENSION = (dimension*2) -1;
        char[][] gameBoard = new char[realDIMENSION][realDIMENSION];
        for (int i = 0; i < realDIMENSION; i++) {
            for (int j = 0; j < realDIMENSION; j++) {
                if ((i % 2 == 0) && (j % 2 != 0)) {
                    gameBoard[i][j] = PIPE;
                } else if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        gameBoard[i][j] = WALL;
                    } else {
                        gameBoard[i][j] = SHARP;
                    }
                } else {
                    gameBoard[i][j] = WHITESPACE;
                }
            }
        }
        return gameBoard;
    }
     public static void printBoard(char [][] gameBoard ){
        for(char[] row : gameBoard){

            for(char character : row){
                System.out.print(character);
            }
            System.out.println();

        }
     }

}
