package tictactoe;

import tictactoe.controller.GameController;
import tictactoe.models.Player;
import tictactoe.models.Symbol;
import tictactoe.models.types.GameState;
import tictactoe.models.types.PlayerType;
import tictactoe.strategy.ColumnWinningStrategy;
import tictactoe.strategy.GameWinningStrategy;
import tictactoe.strategy.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        GameController gamecontroller = new GameController();
        Scanner scanner = new Scanner(System.in);

        List<Player> players = new ArrayList<>();

        players.add( new Player("Govardanam",1,new Symbol('x'), PlayerType.HUMAN,scanner));

        players.add(new Player("Sai",2, new Symbol('o'),PlayerType.HUMAN,scanner));

        //adding the game winning strategy
        List<GameWinningStrategy> winRules = new ArrayList<>();
        winRules.add(new RowWinningStrategy());
        winRules.add(new ColumnWinningStrategy());

        Game game = gamecontroller.gameStart(players, winRules, 3);
        while(gamecontroller.checkGameState(game).equals(GameState.IN_PROGRESS)){
            //printboard

            //ask for input

            //makeMove
        }


    }
}
