package BuilderPackage;

public class Builder {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void build() {

    }

}
