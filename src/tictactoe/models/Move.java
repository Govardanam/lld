package tictactoe.models;

public class Move {
    private Cell cell;
    private Player player;

    public Move(Cell cell, Move move){
        this.cell =cell;
        this.move = move;
    }

    public Cell getCell() {
        return cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
