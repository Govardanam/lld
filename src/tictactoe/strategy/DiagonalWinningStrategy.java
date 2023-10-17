package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;
import tictactoe.models.Symbol;
import tictactoe.models.types.CellState;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements GameWinningStrategy{

    private final Map<Integer, HashMap<Symbol,Integer>> rowColCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //logic check the row along with symbol count of player
       Symbol symbol = move.getPlayer().getSymbol();
       for(int i=0;i<board.getDimensions();i++){
           Cell cell = board.getBoard().get(i).get(i);
           if(cell.getCellState().equals(CellState.FILLED)){
               if(cell.getPlayer().equals(move.getPlayer())){

               }
               else{
                   return false;
               }
           }
           else{
               return false;
           }
       }

        return true;
    }

    @Override
    public void handleUndo( Move move) {
      /*  int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        Map<Symbol,Integer> symbolCount = rowColCount.get(row);
        symbolCount.put(symbol,symbolCount.get(symbol)-1);
*/
    }
}
