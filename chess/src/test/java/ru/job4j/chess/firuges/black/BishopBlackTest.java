package ru.job4j.chess.firuges.black;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void whenC2ToG5ThenTrue() {
        BishopBlack right = new BishopBlack(Cell.C1);
        Cell dest = Cell.G5;
        boolean expected = right.isDiagonal(right.position(), dest);
        assertTrue(expected);
    }

    @Test
    public void whenG5ToC2ThenTrue() {
        BishopBlack right = new BishopBlack(Cell.G5);
        Cell dest = Cell.C1;
        boolean expected = right.isDiagonal(right.position(), dest);
        assertTrue(expected);
    }

    @Test
    public void whenC5ToF2ThenTrue() {
        BishopBlack right = new BishopBlack(Cell.C5);
        Cell dest = Cell.F2;
        boolean expected = right.isDiagonal(right.position(), dest);
        assertTrue(expected);
    }

    @Test
    public void whenC2ToG7ThenFalse() {
        BishopBlack right = new BishopBlack(Cell.C2);
        Cell dest = Cell.G7;
        boolean expected = right.isDiagonal(right.position(), dest);
        assertFalse(expected);
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