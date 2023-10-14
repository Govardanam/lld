package exceptions;

public class client {

    public static void main(String[] args) {
        int a =1;
        int b =0;
        try{
            if(b==0)
            throw new RuntimeException();
            int c=a/b;
        }/* catch(Exception e){
            System.out.println(e.getMessage());
        }*/catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this is inside the finally block");
        }
    }
}
