package singleton.synchronizeds;

public class DataBaseConnection{


        //based on double lock checking
        private static DataBaseConnection instance = null;
        private DataBaseConnection() {
        }
        //@Override
        //public void run() {
           // DataBaseConnection.getInstance



            public static DataBaseConnection getInstance () {
                // based on double checking the locks
                if (instance == null) {
                    synchronized (DataBaseConnection.class) {
                        if (instance == null) {
                            instance = new DataBaseConnection();
                            System.out.println(Thread.currentThread().getName());
                        }

                    }
                }
                return instance;
            }


   /* public static void main(String[] args) {
        DataBaseConnection bd = new DataBaseConnection();
        System.out.println(bd);
        DataBaseConnection bd2 = new DataBaseConnection();
        System.out.println(bd2);


    }*/
        }





