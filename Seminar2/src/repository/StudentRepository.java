package repository;

import data.Student;
import util.RemoverByGroupAgeFromTxt;
import util.RemoverFromTxt;
import util.WriterToTxt;

import java.io.IOException;

public class StudentRepository implements UserRepository<Student, Integer>{
    private Integer groupNumber;
    private Integer age;
    private String fio;


    public StudentRepository(Integer groupNumber, Integer age) {
        this.groupNumber = groupNumber;
        this.age = age;
    }

    public StudentRepository() {
        this.fio = "";
        this.groupNumber = 0;
        this.age = 0;
    }

    public StudentRepository(String fio) {
        this.fio = fio;
    }

    @Override
    public void save(Student entity) {
        WriterToTxt.write(new Student(entity));
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

    @Override
    public void delete(Student fio) {
        RemoverFromTxt.delete(new Student(fio));
    }

    @Override
    public void delete(Integer groupNumber, Integer age) {
        RemoverByGroupAgeFromTxt.delete(groupNumber, age);
    }
}
