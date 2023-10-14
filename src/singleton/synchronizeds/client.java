package singleton.synchronizeds;

public class client {
     public static void main(String[] args) {
         //DataBaseConnection bd = new DataBaseConnection();
         Thread t1 = new Thread();
         Thread t2 = new Thread();
         t1.start();
        // DataBaseConnection instance = DataBaseConnection.getInstance();
         t2.start();
         //DataBaseConnection instance2 =DataBaseConnection.getInstance();
        // t2.stop();
         //t1.stop();

    }
}
