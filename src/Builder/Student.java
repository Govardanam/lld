package Builder;

public class Student {
    private String name;
    private int age;
    private String batchId;
    private int gradYear;
    private String universityName;
    private double psp;


    //private Student(Builder)

    private Student(Builder builder){
        this.name = builder.name;
        this.age=builder.age;
        this.batchId=builder.batchId;
        this.gradYear=builder.gradYear;
        this.universityName=builder.universityName;
        this.psp=builder.psp;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public int getAge() {
        return age;
    }

    public String getBatchId() {
        return batchId;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double getPsp() {
        return psp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }



    public String getName() {
        return name;
    }


    public static class Builder{
        private String name;
        private int age;
        private String batchId;
        private int gradYear;;
        private String universityName;
        private double psp;

        public Student build(){
            if(this.getGradYear()>2022)
                throw new IllegalArgumentException("invalid grad year");

            return new Student(this);

        }

        public  Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }



        public int getGradYear() {
            return gradYear;
        }


    }
}
