package data.iterators;

import data.Student;
import data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentsList;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentsList) {
        this.studentsList = studentsList.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
