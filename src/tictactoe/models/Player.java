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
        System.out.println("Please tell the row count where do you wnat to move");
        int row = scanner.nextInt();
        System.out.println("Please tell the column count where do you wnat to move");
        int col= scanner.nextInt();

    return new Move( new Cell(row,col), this);
    }
}
