package ru.job4j.chess.firuges.black;

import org.junit.Test;
import static org.junit.Assert.*;

import ru.job4j.chess.ImpossibleMoveException;
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
    public void whenC2ToG5ThenD2E3F4G5() {
        BishopBlack rightBB = new BishopBlack(Cell.C1);
        Cell[] arr = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] expected = rightBB.way(Cell.G5);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void whenG5ToC2ThenF4E3D2C1() {
        BishopBlack rightBB = new BishopBlack(Cell.G5);
        Cell[] arr = {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        Cell[] expected = rightBB.way(Cell.C1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void whenC5ToG1ThenD4E3F2G1() {
        BishopBlack rightBB = new BishopBlack(Cell.C5);
        Cell[] arr = {Cell.D4, Cell.E3, Cell.F2, Cell.G1};
        Cell[] expected = rightBB.way(Cell.G1);
        assertArrayEquals(expected, arr);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenC5ToG2ThenD4E3F2G1() {
        BishopBlack rightBB = new BishopBlack(Cell.C5);
        Cell[] arr = {Cell.D4, Cell.E3, Cell.F2, Cell.G1};
        Cell[] expected = rightBB.way(Cell.G2);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void copy() {
        BishopBlack soursFig = new BishopBlack(Cell.G8);
        Figure newFig = soursFig.copy(Cell.G5);
        Cell expected = Cell.G5;
        Cell actual = newFig.position();
        assertEquals(expected, actual);
    }
}