package factoryDesignPattern;

import factoryDesignPattern.component.button.AndroidButton;
import factoryDesignPattern.component.button.Button;
import factoryDesignPattern.component.menu.AndroidMenu;
import factoryDesignPattern.component.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton(){
        return new AndroidButton();
    }
    @Override
    public Menu createMenu(){
        return new AndroidMenu();
    }

}
