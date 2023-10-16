package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Integer dimensions;
    private List<List<Cell>> board;
    public Board(Integer dimensions){
        board = new ArrayList<>();
        for(int i=0;i<dimensions;i++){
            board.add(new ArrayList<>());
            for(int j=0;j<dimensions;j++)
                board.get(i).add(new Cell(i,j));
        }

        this.dimensions = dimensions;
    }

    public Integer getDimensions() {
        return dimensions;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void printBoard() {
        for(List<Cell>  row : board){
            for( Cell cell : row)
                cell.display();
            System.out.println();
        }
        System.out.println("\n");

    }
}
