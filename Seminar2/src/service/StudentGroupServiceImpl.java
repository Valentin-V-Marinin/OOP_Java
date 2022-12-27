package service;

import data.StudentGroup;
import data.iterators.StudentGroupIterator;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.io.IOException;

public class StudentGroupServiceImpl implements DataGroupService {

    @Override
    public void create(int groupNumber, StudentGroup sg) throws IOException {
        WriterToTxt.writeGroup(groupNumber, sg);
    }

    @Override
    public StudentGroup read(int groupNumber) throws IOException {
        return ReaderFromTxt.readGroup(groupNumber);
    }

    public void removeStudent(String fio, StudentGroup sg){
        StudentGroupIterator sgi = new StudentGroupIterator(sg);
        while (sgi.hasNext()){
            if (sgi.next().getFio().equals(fio)) sgi.remove();
        }
    }
}
