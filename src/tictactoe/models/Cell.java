package tictactoe.models;

import tictactoe.models.types.CellState;

public class Cell {
    private Integer row;
    private Integer column;
    private CellState cellState;
    private Player player;

    public Cell(Integer row, Integer column){
        this.row = row;
        this.column =column;
        this.cellState=CellState.EMPTY;
    }

    public Integer getRow() {
        return row;
    }

    public Player getPlayer() {
        return player;
    }

    public Integer getColumn() {
        return column;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public void display(){

        if(this.getCellState().equals(CellState.EMPTY)){
            System.out.println("| - |");
        }else{
            System.out.println("| "+ this.getPlayer().getSymbol().getPlayerSymbol()+" |");
        }

    }
}
