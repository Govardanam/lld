package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

import java.util.Map;
import java.util.HashMap;

public class RowWinningStrategy implements GameWinningStrategy{

    private final Map<Integer, HashMap<Symbol,Integer>> rowColCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //logic check the row along with symbol count of player

        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!rowColCount.containsKey(symbol))
            rowColCount.put(row,new HashMap<>());

        Map<Symbol,Integer> symbolCount = rowColCount.get(row);

        if(!symbolCount.containsKey(symbol))
            symbolCount.put(symbol,1);
        else
            symbolCount.put(symbol,symbolCount.get(row)+1);

        //logic for winning
        if(symbolCount.get(symbol)==board.getDimensions())
            return true;

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
