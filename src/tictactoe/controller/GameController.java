package tictactoe.controller;

import tictactoe.models.Game;
import tictactoe.models.Player;
import tictactoe.models.types.GameState;
import tictactoe.strategy.GameWinningStrategy;

import java.util.List;

public class GameController {


    public void printBoard(Game game){
        game.printBoard();
    }

    public GameState checkGameState(Game game){
        return game.GameState;
    }
    public Game gameStart(List<Player> players, List<GameWinningStrategy> winningStrategies,
                          Integer dimensions){
       return  Game.getBuilder().setDimension(dimensions)
                                     .setPlayers(players)
                                     .setWinningStrategies(winningStrategies).build();


    }
}
