package Data;

public class Student extends User{
    private int groupNumber;

    public Student(String fio, int age, int passport, int groupNumber) {
        super(fio, age, passport);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
