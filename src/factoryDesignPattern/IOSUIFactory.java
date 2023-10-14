package factoryDesignPattern;

import factoryDesignPattern.component.button.Button;
import factoryDesignPattern.component.button.IOSButton;
import factoryDesignPattern.component.menu.Menu;
import factoryDesignPattern.component.menu.IOSMenu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton(){
        return new IOSButton();
    }

    @Override
    public Menu createMenu(){
        return new IOSMenu();
    }

}
