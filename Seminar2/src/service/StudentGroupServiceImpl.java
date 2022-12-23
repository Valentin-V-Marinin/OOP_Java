package service;

import Data.StudentGroup;
import Util.ReaderFromTxt;
import Util.WriterToTxt;

import java.io.IOException;

public class StudentGroupServiceImpl implements DataServiceGroup{

    @Override
    public void create(int groupNumber, StudentGroup sg) throws IOException {
        WriterToTxt.writeGroup(groupNumber, sg);
    }

    @Override
    public StudentGroup read(int groupNumber) throws IOException {
        return ReaderFromTxt.readGroup(groupNumber);
    }

}
