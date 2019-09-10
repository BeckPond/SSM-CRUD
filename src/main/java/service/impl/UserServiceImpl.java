package service.impl;

import bean.User;
import dao.IUserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IUerService;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements IUerService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public User queryById(Integer id) {
        return userDao.queryById(id);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        if (user.getId() == null) {
            userDao.add(user);
        } else {
            userDao.update(user);
        }
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
}
