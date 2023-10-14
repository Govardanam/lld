package factoryDesignPattern;

public class Flutter {

    public UIFactory getUIFactory(String Platform){
        return UIFactoryFactory.getUIFactoryByPlatform(Platform);
    }
}
