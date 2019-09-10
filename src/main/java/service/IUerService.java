package service;

import bean.User;

import java.util.List;


public interface IUerService {
    List<User> queryAll();

    User queryById(Integer id);

    void add(User user);

    void update(User user);

    void delete(User user);
}
