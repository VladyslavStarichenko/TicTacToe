package ua.com.alevel.models;

public interface Player {


    int [] getPositionToMove();

    char[][] makeMove(char[][] gameBoard, int[] position);

}
