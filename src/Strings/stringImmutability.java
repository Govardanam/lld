package Strings;

public class stringImmutability {

    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3 = new String("hello");
        //String s1 ="hell";
        s1.replace('l','x');
        System.out.println(s1);

        String stemp="";
       /* for(int i=0;i<100000;i++){
            stemp=stemp+i;
        System.out.println(stemp);
        }*/

    }
}
