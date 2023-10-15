package tictactoe.strategy;

import org.jetbrains.annotations.NotNull;
import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements GameWinningStrategy{
    private final Map<Integer, HashMap<Symbol,Integer>> colCountMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        //login
        //check along the columns using  hashMap of symbol + count.. with parent hashMap key of column number

        int col = move.getCell().getColumn();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!colCountMap.containsKey(col))
            colCountMap.put(col,new HashMap<>());

        Map<Symbol,Integer> symbolCount = colCountMap.get(col);

        if(!symbolCount.containsKey(symbol))
                symbolCount.put(symbol,1);
        else
            symbolCount.put(symbol,symbolCount.get(symbol)+1);

        //logic

        if(symbolCount.get(symbol)== board.getDimensions())
            return true;

        return false;

    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
