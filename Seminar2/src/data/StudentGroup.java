package data;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudentGroup implements Iterable<Student> {

    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    };

    public StudentGroup(StudentGroup obj) {
        this.teacher = obj.teacher;
        this.studentList = obj.studentList;
    };

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return null; //new studentIterator(this);
    }

}
