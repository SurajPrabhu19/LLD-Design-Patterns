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
    public Student(Builder builder) {
        // validation:
        if (builder.getGradYear() > 2023)
            throw new IllegalArgumentException();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
    }

    // Methods:

}
