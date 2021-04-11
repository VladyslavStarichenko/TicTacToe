package ua.com.alevel.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealPlayerTest {
    int positionXToMove = 1;
    int positionYToMove = 2;
    @Test
    void getPositionToMove() {

        assertTrue(positionXToMove <= 3 && positionXToMove >= 1);
        positionXToMove = 4;
        assertFalse(positionXToMove <= 3 && positionXToMove >= 1);

        assertTrue(positionYToMove <= 3 && positionYToMove >= 1);
        positionYToMove = 5;
        assertFalse(positionYToMove <= 3 && positionYToMove >= 1);
    }


}