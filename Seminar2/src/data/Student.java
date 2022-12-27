package data;

public class Student extends User{
    private int groupNumber;

    public Student(String fio, int birthYear, int age, int passport, int groupNumber) {
        super(fio, birthYear, age, passport);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getInfo() {
        return super.getFio() +" "+ super.getBirthYear() +" "+ super.getAge() +
                " "+ super.getPassport() +" "+ this.getGroupNumber();
    }
}
