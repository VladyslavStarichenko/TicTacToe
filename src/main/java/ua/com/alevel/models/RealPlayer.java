package ua.com.alevel.models;

import java.util.Scanner;



public class RealPlayer implements Player{

    private static final Character SIGN = 'x';

    @Override
    public int[] getPositionToMove() {
        int [] resultArray = new int[2];
        System.out.println("Please choose the row you wanna move!");
        Scanner scanner = new Scanner(System.in);
        int positionXToMove = scanner.nextInt();
        resultArray[0] = positionXToMove;
        System.out.println("Please choose the column you wanna move!");
        int positionYToMove = scanner.nextInt();
        resultArray[1] = positionYToMove;
        return resultArray;
    }

    @Override
    public char[][] makeMove(char[][] gameBoard, int[] position) {
        int x = position[0];
        int y = position[1];
                if(Logic.checkForMovement(gameBoard,position)){
                    Logic.movement(gameBoard,x,y, SIGN);
                }else if(!Logic.checkForMovement(gameBoard,position)){
                    int [] newPosition = getPositionToMove();
                    makeMove(gameBoard,newPosition);
                }
        return gameBoard;
    }

    public char[][] playersTurn(char [][] board){
        int [] position = getPositionToMove();
        return makeMove(board, position);
    }

}
