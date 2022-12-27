package service;

import data.StudentGroup;

import java.io.IOException;

public interface DataGroupService {
    void create(int groupNumber, StudentGroup sg) throws IOException;
    StudentGroup read(int groupNumber) throws IOException;

    void removeStudent(String fio, StudentGroup sg);

}
