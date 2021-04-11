package ua.com.alevel.models;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {

    @Test
    void getPositionToMove() {
        Random random = new Random();
        int positionXToMove = random.nextInt(3) + 1;
        int positionYToMove = random.nextInt(3) + 1;
        assertTrue(positionXToMove <= 3 && positionXToMove >= 1);
        positionXToMove = 4;
        assertFalse(positionXToMove <= 3 && positionXToMove >= 1);

        assertTrue(positionYToMove <= 3 && positionYToMove >= 1);
        positionYToMove = 5;
        assertFalse(positionYToMove <= 3 && positionYToMove >= 1);
    }


    @Test
    void move() {
        char sign2 = 'o';
        char[][] gameBoard = Board.createBoard(3);
        char[][] gameBoardWithMove = Board.createBoard(3);
        int [] resultArray = {1,1};

        assertEquals(gameBoardWithMove[0][0], gameBoard[0][0]);
        ComputerPlayer computerPlayer = new ComputerPlayer();
        computerPlayer.move(gameBoardWithMove,resultArray,sign2);
        assertNotEquals(gameBoardWithMove[0][0], gameBoard[0][0]);



    }

}