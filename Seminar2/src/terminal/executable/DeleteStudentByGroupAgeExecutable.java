package terminal.executable;

import service.StudentServiceImpl;

public class DeleteStudentByGroupAgeExecutable implements CommandExecutable{
    private StudentServiceImpl studentService;
    private int groupNumber;
    private int age;


    public DeleteStudentByGroupAgeExecutable(StudentServiceImpl studentService, int groupNumber, int age) {
        this.studentService = studentService;
        this.groupNumber = groupNumber;
        this.age = age;
    }

    @Override
    public void execute() {
        studentService.delete(groupNumber, age);
    }
}
