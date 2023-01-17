package terminal.executable;

import data.Student;
import service.StudentServiceImpl;

public class DeleteStudentExecutable_A implements CommandExecutable{
    private StudentServiceImpl studentService;
    private int group_id;
    private int age;


    public DeleteStudentExecutable_A(StudentServiceImpl studentService, int group_id, int age) {
        this.studentService = studentService;
        this.group_id = group_id;
        this.age = age;
    }

    @Override
    public void execute() {
        studentService.delete(group_id, age);
    }
}
