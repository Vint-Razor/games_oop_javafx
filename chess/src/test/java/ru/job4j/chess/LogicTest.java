package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenNotFigThenExc() throws OccupiedCellException,
            FigureNotFoundException {
        Cell sours = Cell.C1;
        Cell dest = Cell.G5;
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C2));
        logic.move(sours, dest);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccuWayThenExc() throws OccupiedCellException,
            FigureNotFoundException {
        Cell sours = Cell.C1;
        Cell dest = Cell.G5;
        Logic logic = new Logic();
        logic.add(new BishopBlack(sours));
        logic.add(new BishopBlack(Cell.F4));
        logic.move(sours, dest);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenC1G7ThenExc() throws OccupiedCellException,
            FigureNotFoundException, ImpossibleMoveException {
        Cell sours = Cell.C1;
        Cell dest = Cell.G7;
        Logic logic = new Logic();
        logic.add(new BishopBlack(sours));
        logic.move(sours, dest);
    }
}