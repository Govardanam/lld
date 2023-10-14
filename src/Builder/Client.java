package Builder;

public class Client {

    public static void main(String[] args) {


        Student st = Student.getBuilder()
                .setName("gova")
                .setGradYear(2022)
                .setAge(23).setUniversityName("govaUniveristy").build();

        System.out.println("debug");
        System.out.println("select if the github change is working or not");
        System.out.println("confirm chagne");

    }

}
