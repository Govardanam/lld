package factoryDesignPattern.component.button;

public class AndroidButton implements Button{

    @Override
    public void changeSize(){
        System.out.println("Android button changeSize()");
    }
}
