package factoryDesignPattern.component.menu;

public class IOSMenu implements Menu {

    @Override
    public void getMenu() {
        System.out.println("IOS Menu getMenu");
    }
}
