package factoryDesignPattern;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/* practical factory*/
public class UIFactoryFactory {

    /*@NotNull
    @Contract("_ -> new")*/
    public static UIFactory getUIFactoryByPlatform(String Platform){
        if(Platform.equals("Android"))
                return new AndroidUIFactory();
        else if((Platform.equals("IOS")))
                return new IOSUIFactory();
        else
            return null;
    }
}
