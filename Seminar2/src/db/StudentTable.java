package db;

import data.Student;
import terminal.CommandParser;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactory;

import java.util.ArrayList;

public class StudentTable extends Table<Student> {

    public static StudentTable studentTable;

    public static StudentTable getInstance(){
        if (studentTable == null){
            studentTable = new StudentTable();

        }
        return studentTable;
    }

    private StudentTable() {
        elements = new ArrayList<>();
    }

    @Override
    public Student save(Student entity) {
        elements.add(entity);
        showListStudents();
        return entity;
    }

    public boolean removeByFio(String fio) {
        for (Student student : elements) {
            if (student.getFio().equals(fio)) {
                elements.remove(student);
                showListStudents();
                return true;
            }
        }
        showListStudents();
        return false;
    }


    public void showListStudents() {
        for (Student student : elements) {
            System.out.println(student.getInfo());
        }
    }

}
