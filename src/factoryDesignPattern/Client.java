package factoryDesignPattern;
import factoryDesignPattern.component.button.*;

public class Client {

    public static void main(String[] args) {
        Flutter ft = new Flutter();
        UIFactory androidFactory = ft.getUIFactory("Android");
        Button button = androidFactory.createButton();
        button.changeSize();
        System.out.println(button);

    }
}
