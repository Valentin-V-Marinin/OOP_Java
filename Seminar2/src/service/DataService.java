package service;

import Data.User;

import java.io.IOException;

public interface DataService {
    void create(User user) throws IOException;
    User read(User user);
}
