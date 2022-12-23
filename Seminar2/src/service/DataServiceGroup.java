package service;

import Data.StudentGroup;

import java.io.IOException;

public interface DataServiceGroup{
    void create(int groupNumber, StudentGroup sg) throws IOException;
    StudentGroup read(int groupNumber) throws IOException;

}
