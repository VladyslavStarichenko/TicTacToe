package ua.com.alevel.models;

import java.util.Random;

public class ComputerPlayer implements Player{

    private static final Character SIGN = 'o';
    @Override
    public int[] getPositionToMove() {
        int [] resultArray = new int[2];
        Random random = new Random();
        int positionXToMove = random.nextInt(3) + 1;
        int positionYToMove = random.nextInt(3) + 1;
        resultArray[0] = positionXToMove;
        resultArray[1] = positionYToMove;
        return resultArray;
    }

    @Override
    public char[][] makeMove(char[][] gameBoard, int[] position) {
        return move(gameBoard, position, SIGN);
    }

     public char[][] move(char[][] gameBoard, int[] position, Character sign) {
                if(Logic.checkForMovement(gameBoard,position)){
                    Logic.movement(gameBoard,position[0],position[1], sign);
                }else if(!Logic.checkForMovement(gameBoard,position)){
                    int [] newPositions = getPositionToMove();
                    move(gameBoard,newPositions,sign);
                }
        return gameBoard;
    }

    public char[][] computersTurn(char [][] board){
        int [] position = getPositionToMove();
        return makeMove(board, position);
    }
}
