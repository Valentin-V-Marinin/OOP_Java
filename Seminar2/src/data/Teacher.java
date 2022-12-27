package data;

public class Teacher extends User {
    private String department;

    public Teacher(String fio, int yearBirth, int age, int passport, String department) {
        super(fio, yearBirth, age, passport);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInfo() {
        return super.getFio() + " " + super.getBirthYear() + " " + super.getAge() +
                " " + super.getPassport() + " " + this.getDepartment();

    }
}
