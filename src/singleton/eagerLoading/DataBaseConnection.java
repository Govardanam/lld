package singleton.eagerLoading;

public class DataBaseConnection {

    //private static DataBaseConnection instance = null;
    private static DataBaseConnection instance = new DataBaseConnection();

    private DataBaseConnection(){}

    /*public static DataBaseConnection getInstance(){
        if (instance==null){
            instance = new DataBaseConnection();
        }
        return instance;
    }*/

    //works for multi threading
    public static DataBaseConnection getInstance(){
        return instance;
    }

}
