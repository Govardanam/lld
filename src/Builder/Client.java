package Builder;

public class Client {

    public static void main(String[] args) {


        Student st = Student.getBuilder()
                .setName("gova")
                .setGradYear(2022)
                .setAge(23).setUniversityName("govaUniveristy").build();

        System.out.println("debug");



    }

}
