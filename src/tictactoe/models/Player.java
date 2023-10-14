package tictactoe.models;
import tictactoe.models.types.PlayerType;
import java.util.Scanner;

public class Player {
    private String name;
    private Integer id;
    private Symbol symbol;
    private PlayerType type;
    private Scanner  scanner;

    public Player(String name, Integer id, Symbol symbol, PlayerType type, Scanner scanner){
        this.name =name;
        this.id = id;
        this.symbol=symbol;
        this.type = type;
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getType() {
        return type;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public Move makeMove(){
    return new Move();
    }
}
