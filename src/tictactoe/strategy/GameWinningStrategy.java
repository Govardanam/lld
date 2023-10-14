package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface GameWinningStrategy {

    boolean checkWinner(Board board, Move move);
    void handleUndo(Board board, Move move);
}
