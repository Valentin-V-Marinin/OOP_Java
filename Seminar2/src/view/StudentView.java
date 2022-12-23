package view;

import Data.User;

import java.util.List;

public class StudentView extends UserView {
    @Override
    public User findTheBest(List<User> userList) {
        return userList.get(3);
    }

}
