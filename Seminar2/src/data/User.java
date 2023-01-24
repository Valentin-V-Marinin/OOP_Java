package data;

public abstract class User {
    private String fio;
    private int birthYear;
    private int age;
    private int passport;

    public User(String fio, int birthYear, int age, int passport) {
        this.fio = fio;
        this.birthYear = birthYear;
        this.age = age;
        this.passport = passport;
    }

    public User(String fio) {
        this.fio = fio;
    }

    public User(User user) {
        this.fio = user.fio;
        this.birthYear = user.birthYear;
        this.age = user.age;
        this.passport = user.passport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }
}
