package ua.com.alevel;

import ua.com.alevel.models.Board;
import ua.com.alevel.models.ComputerPlayer;
import ua.com.alevel.models.Logic;
import ua.com.alevel.models.RealPlayer;

public class App {

    private static final int gameBoardSize = 3;

    public static void main(String[] args) {
        char[][] gameBoard = Board.createBoard(gameBoardSize);

        RealPlayer realPlayer = new RealPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        startGame(gameBoard, realPlayer, computerPlayer);
    }

    private static void startGame(char[][] gameBoard, RealPlayer realPlayer, ComputerPlayer computerPlayer) {
        while (true) {
            Board.printBoard(gameBoard);
            System.out.println();
            char[][] tempBoard = realPlayer.playersTurn(gameBoard);
            if (Logic.checkForCombination(tempBoard, 'x','o')) {
                break;
            }
            System.out.println();
            gameBoard = computerPlayer.computersTurn(tempBoard);
            if (Logic.checkForCombination(gameBoard,'x','o')) {
                break;
            }
            System.out.println();
        }
    }
}
