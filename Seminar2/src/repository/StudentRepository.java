package repository;

import data.Student;
import db.StudentTable;
import util.RemoverByGroupAgeFromTxt;

public class StudentRepository implements UserRepository<Student, Integer> {

    private StudentTable studentTable;
    private Integer groupNumber;
    private Integer age;
    private String fio;


    public StudentRepository(Integer groupNumber, Integer age) {
        this.groupNumber = groupNumber;
        this.age = age;
    }

    public StudentRepository() {
        this.studentTable = StudentTable.getInstance();
        this.fio = "";
        this.groupNumber = 0;
        this.age = 0;
    }

    public StudentRepository(String fio) {
        this.fio = fio;
    }

    @Override
    public void save(Student entity) {
        studentTable.save(entity);
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
    public void delete(Student student) {
        studentTable.removeByFio(student.getFio());
    }

    @Override
    public void delete(Integer groupNumber, Integer age) {
        RemoverByGroupAgeFromTxt.delete(groupNumber, age);
    }
}
