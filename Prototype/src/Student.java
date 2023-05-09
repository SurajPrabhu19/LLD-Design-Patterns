public class Student implements IPrototype<Student> {

    // ATTRIBUTES:
    int age;
    String name;
    double psp;
    double avgBatchPsp;
    String batchName;

    public Student() {
        super();
    }

    public Student(Student student) {
        super();
        this.age = student.age;
        this.name = student.name;
        this.psp = student.psp;
        this.avgBatchPsp = student.avgBatchPsp;
        this.batchName = student.batchName;
    }

    // METHODS:
    @Override
    public Student clone() {
        return new Student(this);
    }
}
