package service;

import data.StudentGroup;
import data.iterators.StudentGroupIterator;
import repository.Repository;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.io.IOException;

public class StudentGroupServiceImpl implements DataGroupService {
    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public Repository<StudentGroup, Integer> getStudentGroupIntegerRepository() {
        return studentGroupIntegerRepository;
    }

    @Override
    public void create(int groupNumber, StudentGroup sg) throws IOException {
        WriterToTxt.writeGroup(groupNumber, sg);
    }

    @Override
    public StudentGroup read(int groupNumber) throws IOException {
        return ReaderFromTxt.readGroup(groupNumber);
    }

    public void removeStudent(String fio, StudentGroup sg) {
        StudentGroupIterator sgi = new StudentGroupIterator(sg);
        while (sgi.hasNext()) {
            if (sgi.next().getFio().equals(fio)) sgi.remove();
        }
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup findGroup(int groupNumber) {
        return studentGroupIntegerRepository.findById(groupNumber);
    }
}
