package factoryDesignPattern;
import factoryDesignPattern.component.button.Button;
import factoryDesignPattern.component.menu.Menu;

/*
This is the abstract factory
*/
public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
