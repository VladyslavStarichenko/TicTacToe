package ua.com.alevel.models;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @org.junit.jupiter.api.Test
    void createBoard() {
        char[][] board = Board.createBoard(3);
        char [] row = board[0];
        assertNotNull(board);
        assertEquals(board.length, 5);
        assertEquals(row.length, 5);
    }

}