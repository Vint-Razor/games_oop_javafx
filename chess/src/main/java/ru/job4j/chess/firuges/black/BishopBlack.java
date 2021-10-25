package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        throw new ImpossibleMoveException(
                String.format("Could not way by diagonal from %s to %s", position, dest)
        );
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        int x1 = source.getX();
        int x2 = dest.getX();
        int y1 = source.getY();
        int y2 = dest.getY();
        if (x1 < x2 && y1 > y2 || x1 > x2 && y1 < y2 ) {
            return x1 + y1 == x2 + y2;
        } else {
            return x1 - y1 == x2 - y2;
        }
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
