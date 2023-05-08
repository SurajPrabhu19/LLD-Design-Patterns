package BuilderPackage;

// import BuilderPackage.Builder;

public class Student {

    // Attributes:
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    // Ctor
    private Student(Builder builder) {
        // validation:
        if (builder.getGradYear() > 2023)
            throw new IllegalArgumentException();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
    }

    // Methods:

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;

        public Builder getBuilder() {
            return new Builder();
        }

        public long getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public double getPsp() {
            return psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public String getBatch() {
            return batch;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}
