package BuilderPackage;

// import BuilderPackage.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Builder builder = Student.getBuilder()
                .setName("Suraj")
                .setGradYear(2022)
                .setAge(24);

        Student student = new Student(builder);
        System.out.println(student);
    }
}
