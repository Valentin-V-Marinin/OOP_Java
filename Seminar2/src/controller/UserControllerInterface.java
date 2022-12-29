package controller;

import data.Student;
import data.User;

public interface UserControllerInterface<U extends User, G> extends ControllerInterface<U, G>{
    U findByFio(String fio);
}
