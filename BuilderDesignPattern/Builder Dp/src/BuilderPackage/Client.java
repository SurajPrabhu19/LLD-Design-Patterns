package BuilderPackage;

// import BuilderPackage.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Builder builder = new Builder();
        builder.setName("Suraj");
        builder.setAge(24);
        // builder.setGradYear(2021);
        builder.setGradYear(2024);

        Student student = new Student(builder);
        System.out.println(student);
    }
}
