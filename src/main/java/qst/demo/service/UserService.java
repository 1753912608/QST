package qst.demo.service;

import qst.demo.dao.User;

import java.util.List;

public interface UserService {
    String insert(User user);

    String delete(String user_id);

    String modify(User user);

    List<User> getUserList();
}
