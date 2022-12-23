package Data;

public class Teacher extends User{
    private String department;

    public Teacher(String fio, int age, int passport, String department) {
        super(fio, age, passport);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
