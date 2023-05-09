import java.util.Map;

public class Client {

    public static void fillRegister(StudentRegistry<Student> registry) {
        Student aprilBatchStudent = new Student();
        aprilBatchStudent.avgBatchPsp = 89.0;
        aprilBatchStudent.batchName = "april23";
        registry.register("aprilBatchStudent", aprilBatchStudent);

        IntelligentStudent aprilBatchIntelligentStudent = new IntelligentStudent();
        aprilBatchIntelligentStudent.avgBatchPsp = 89.0;
        aprilBatchIntelligentStudent.batchName = "april23";
        registry.register("aprilBatchIntelligentStudent", aprilBatchIntelligentStudent);
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        StudentRegistry<Student> registry = new StudentRegistry<Student>();
        fillRegister(registry);

        Student studentCopy = registry.get("aprilBatchStudent").clone();
        studentCopy.name = "Suraj";
        studentCopy.age = 24;
        studentCopy.psp = 89;

        Student intelligentStudentCopy = registry.get("aprilBatchIntelligentStudent").clone();
        intelligentStudentCopy.name = "Nitin";
        intelligentStudentCopy.age = 24;
        intelligentStudentCopy.psp = 100;
        var map = registry.getMap();
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(studentCopy);
        System.out.println(intelligentStudentCopy);
        System.out.println(map);
    }
}
