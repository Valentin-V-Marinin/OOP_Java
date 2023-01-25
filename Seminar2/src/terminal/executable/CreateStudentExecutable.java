package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

public class CreateStudentExecutable implements CommandExecutable {
    private final StudentServiceImpl studentService;
    private final Student student;

    public CreateStudentExecutable(StudentServiceImpl studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.saveStudent(student);
    }
}
