package dao;

import bean.User;

import java.util.List;

/**
 * @author 李正磊
 * @createTime 2019-01-16 17:41
 */
public interface IUserDao {
    List<User> queryAll();

    User queryById(Integer id);

    void add(User user);

    void update(User user);

    void delete(User user);

}
