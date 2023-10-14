package testPackage;

public class clientClass{

    public static void main(String[] arg){
        serverClass sc = new serverClass();
        Thread t = new Thread(sc);
        t.start();
    }



}
