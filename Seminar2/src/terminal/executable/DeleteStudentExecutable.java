package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

public class DeleteStudentExecutable implements CommandExecutable {
    private final StudentServiceImpl studentService;
    private final Student student;

    public DeleteStudentExecutable(StudentServiceImpl studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.delete(student);
    }
}
