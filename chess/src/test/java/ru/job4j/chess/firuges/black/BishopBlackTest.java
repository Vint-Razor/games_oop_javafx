package ru.job4j.chess.firuges.black;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Ignore
    @Test
    public void whenC2ToG5ThenTrue() {
        BishopBlack right = new BishopBlack(Cell.C2);
        Cell dest = Cell.G5;
        boolean expected = right.isDiagonal(right.position(), dest);
        assertTrue(expected);
    }

    @Test
    public void position() {
        Cell actual = Cell.G8;
        Figure rightBB = new BishopBlack(actual);
        Cell expected = rightBB.position();
        assertEquals(expected, actual);
    }

    @Test
    public void way() {
    }

    @Test
    public void copy() {
    }
}