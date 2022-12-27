package view;

import data.User;

import java.util.List;

public abstract class UserView {
    public void showTheBest(List<User> userList) {
        User user = findTheBest(userList);
        System.out.println(user.getFio()+ " " + user.getAge()+ " " +user.getPassport());
    }

    protected abstract User findTheBest(List<User> userList);
}
