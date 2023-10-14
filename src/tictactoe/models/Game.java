package tictactoe.models;

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

    }

    public void checkWinner(Move move,  Board board){

    }

    public void validateMove(Move move){

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
