public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent() {
        super();
    }

    public IntelligentStudent(IntelligentStudent istudent) {
        super(istudent);
        this.iq = 10;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
