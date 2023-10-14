package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class ColumnWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
