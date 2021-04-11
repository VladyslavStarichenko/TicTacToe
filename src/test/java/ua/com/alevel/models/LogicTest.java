package ua.com.alevel.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void checkForMovement() {
        char[][] gameBoard = Board.createBoard(3);
        int [] position1 = {1,1};
        int [] position2 = {1,2};
        char [] row = gameBoard[0];
        row[0] = 'x';
        assertFalse(Logic.checkForMovement(gameBoard,position1));
        assertTrue(Logic.checkForMovement(gameBoard,position2));
    }

    @Test
    void movement() {
        char[][] gameBoard = Board.createBoard(3);
        char sign1 = 'x';
        char sign2 = 'o';
        int [] position1 = {1,1};
        int [] position2 = {1,2};
        Logic.movement(gameBoard,position1[0],position1[1],sign1);
        Logic.movement(gameBoard,position2[0],position2[1],sign2);
        assertEquals(gameBoard[0][0],'x');
        assertEquals(gameBoard[0][2],'o');

    }


    @Test
    void firstRowCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol1 = 'x';
        char symbol2 = 'o';
        boardWinPlayer[0][0] = symbol1;
        boardWinPlayer[0][2] = symbol1;
        boardWinPlayer[0][4] = symbol1;
        assertTrue(Logic.firstRowCombination(boardWinPlayer,symbol1));
        boardWinPlayer[0][4] = symbol2;
        assertFalse(Logic.firstRowCombination(boardWinPlayer,symbol1));
    }

    @Test
    void secondRowCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[2][0] = symbol2;
        boardWinPlayer[2][2] = symbol2;
        boardWinPlayer[2][4] = symbol2;
        assertTrue(Logic.secondRowCombination(boardWinPlayer,symbol2));
        boardWinPlayer[2][4] = symbol1;
        assertFalse(Logic.secondRowCombination(boardWinPlayer,symbol2));
    }

    @Test
    void thirdRowCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[4][0] = symbol2;
        boardWinPlayer[4][2] = symbol2;
        boardWinPlayer[4][4] = symbol2;
        assertTrue(Logic.thirdRowCombination(boardWinPlayer,symbol2));
        boardWinPlayer[4][4] = symbol1;
        assertFalse(Logic.thirdRowCombination(boardWinPlayer,symbol2));
    }

    @Test
    void firstColumnCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[0][0] = symbol2;
        boardWinPlayer[2][0] = symbol2;
        boardWinPlayer[4][0] = symbol2;
        assertTrue(Logic.firstColumnCombination(boardWinPlayer,symbol2));
        boardWinPlayer[4][0] = symbol1;
        assertFalse(Logic.firstColumnCombination(boardWinPlayer,symbol2));
    }

    @Test
    void secondColumnCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[0][2] = symbol2;
        boardWinPlayer[2][2] = symbol2;
        boardWinPlayer[4][2] = symbol2;
        assertTrue(Logic.secondColumnCombination(boardWinPlayer,symbol2));
        boardWinPlayer[4][2] = symbol1;
        assertFalse(Logic.secondColumnCombination(boardWinPlayer,symbol2));
    }

    @Test
    void thirdColumnCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[0][4] = symbol2;
        boardWinPlayer[2][4] = symbol2;
        boardWinPlayer[4][4] = symbol2;
        assertTrue(Logic.thirdColumnCombination(boardWinPlayer,symbol2));
        boardWinPlayer[4][4] = symbol1;
        assertFalse(Logic.thirdColumnCombination(boardWinPlayer,symbol2));
    }

    @Test
    void rightDiagonalCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[0][0] = symbol2;
        boardWinPlayer[2][2] = symbol2;
        boardWinPlayer[4][4] = symbol2;
        assertTrue(Logic.rightDiagonalCombination(boardWinPlayer,symbol2));
        boardWinPlayer[4][4] = symbol1;
        assertFalse(Logic.rightDiagonalCombination(boardWinPlayer,symbol2));
    }

    @Test
    void leftDiagonalCombination() {
        char [][] boardWinPlayer = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardWinPlayer[4][0] = symbol2;
        boardWinPlayer[2][2] = symbol2;
        boardWinPlayer[0][4] = symbol2;
        assertTrue(Logic.leftDiagonalCombination(boardWinPlayer,symbol2));
        boardWinPlayer[0][4] = symbol1;
        assertFalse(Logic.leftDiagonalCombination(boardWinPlayer,symbol2));
    }

    @Test
    void tieCombination() {
        char [][] boardTie = Board.createBoard(3);
        char symbol2 = 'o';
        char symbol1 = 'x';
        boardTie[0][0] = symbol2;
        boardTie[0][2] = symbol1;
        boardTie[0][4] = symbol2;
        boardTie[2][2] = symbol2;
        boardTie[2][0] = symbol1;
        boardTie[2][4] = symbol1;
        boardTie[4][0] = symbol1;
        boardTie[4][4] = symbol1;
        assertTrue(Logic.tieCombination(boardTie));
        boardTie[4][2] = symbol2;
        assertFalse(Logic.tieCombination(boardTie));



    }
}