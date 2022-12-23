package service;

import Data.User;
import Util.ReaderFromTxt;
import Util.WriterToTxt;

import java.io.IOException;


public class TeacherServiceImpl implements DataService {

    @Override
    public void create(User user) throws IOException {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
