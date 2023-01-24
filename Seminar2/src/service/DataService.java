package service;

import data.User;

import java.io.IOException;

public interface DataService<U extends User> {
    void create(User user);
    User read(User user);

    void delete(User user);
}
