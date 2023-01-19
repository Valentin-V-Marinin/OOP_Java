package repository;

import data.Student;

public class StudentRepository implements UserRepository<Student, Integer>{
    private Integer groupNumber;
    private Integer age;

    @Override
    public Student save(Student entity) {
       return null;
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
    public Student delete(Student entity) {
        return null;
    }

    @Override
    public Student delete(Integer groupNumber, Integer age) {
        this.groupNumber = groupNumber;
        this.age = age;
        return null;
    }
}
