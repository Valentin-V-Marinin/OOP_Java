package service;

import data.Student;
import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.io.IOException;

public class StudentServiceImpl implements DataService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void saveStudent(Student entity) {
        studentRepository.save(entity);
    }

    public Student findStudent(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudent(String fio) {
        return studentRepository.findByFio(fio);
    }

    @Override
    public void create(User user) throws IOException {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }

    @Override
    public void delete(User user) {
        studentRepository.delete((Student) user);
    }

    public void delete(int groupNumber, int age) {
        studentRepository.delete(groupNumber, age);
    }
}
