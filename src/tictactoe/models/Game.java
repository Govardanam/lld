package tictactoe.models;

import org.jetbrains.annotations.NotNull;
import tictactoe.models.types.CellState;
import tictactoe.models.types.GameState;
import tictactoe.models.types.PlayerType;
import tictactoe.strategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> playerMoves;
    private Player winnerPlayer;
    private GameState gameState;
    private Integer nextPlayerIndex;
    private List<GameWinningStrategy> winningStrategies;

    private Game(int dimensions, List<Player> players, List<GameWinningStrategy> winningStrategies
    ){
        this.players = players;
        this.board = new Board(dimensions);
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex=0;
        this.playerMoves = new ArrayList<>();

    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getPlayerMoves() {
        return playerMoves;
    }

    public Player getWinnerPlayer() {
        return winnerPlayer;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public List<GameWinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    //builder implementation

    public static Builder getBuilder(){
        return new Builder();
    }

    public  void makeMove(){
        Player player = players.get(nextPlayerIndex);

        Move move =null;
        if(player.getType().equals(PlayerType.BOT)){
            // to be implemented
            //bot playing strategy
        } else {
            move = player.makeMove();
        }

        if(!validateMove(move)){
            throw new IllegalCallerException("illegal move");
        }

        Integer row = move.getCell().getRow();
        Integer col = move.getCell().getColumn();

        Cell cellToBeUpdated = board.getBoard().get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(move.getPlayer());

        move.setCell(cellToBeUpdated);
        playerMoves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex= nextPlayerIndex%players.size();





    }

    public void checkWinner(Move move,  Board board){

    }

    public Boolean validateMove( Move move){

        //get the player
        //call make move on player
        //validate move
        //update the cell
        //updateMove
        //after move, check if winner exist
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        if(row>=board.getDimensions() || col>=board.getDimensions())
            return false;

        if(board.getBoard().get(row).get(col).getCellState().equals(CellState.FILLED))
            return false;

        return true;
    }

    public void printBoard(){
        board.printBoard();
    }

    public void undo(){

    }

    public static class Builder{
        private List<Player> players;
        private List<GameWinningStrategy> winningStrategies ;
        private Integer dimensions;

        public Builder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<GameWinningStrategy> winningStrategies){
            this.winningStrategies= winningStrategies;
            return this;
       }

       public Builder setDimension(Integer dimensions){
            this.dimensions=dimensions;
            return this;
       }

       public Game build(){
            doValidations();
            return new Game(dimensions,players,winningStrategies);
       }

       private void doValidations(){
            int countBot=0;
            for(int i=0;i<players.size();i++){
                if(players.get(i).getType().equals(PlayerType.BOT))
                    countBot++;
            }

            if(countBot==players.size())
                throw new IllegalCallerException("No Human Players");

            if(dimensions!=players.size()+1)
                throw new IllegalCallerException("Illegal Board size for Number of Players");
       }



    }

}
