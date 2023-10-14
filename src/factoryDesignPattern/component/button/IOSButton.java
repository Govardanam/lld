package factoryDesignPattern.component.button;

public class IOSButton implements Button{

    @Override
    public void changeSize(){
        System.out.println("IOS button changeSize()");
    }
}
