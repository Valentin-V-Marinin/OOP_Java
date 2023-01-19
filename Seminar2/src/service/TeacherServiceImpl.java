package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.io.IOException;


public class TeacherServiceImpl implements DataService {

    @Override
    public void delete(User user) {

    }

    @Override
    public void create(User user) throws IOException {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
