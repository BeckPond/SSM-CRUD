package service.impl;

import bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUerService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李正磊
 * @createTime 2019-01-18 16:04
 */
public class UserServiceImplTest {

    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Resource
    private IUerService uerService;

    @Test
    public void test1(){
        uerService = (IUerService) ac.getBean("userServiceImpl");
        List<User> users = uerService.queryAll();
        for (User user:users) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        uerService = (IUerService) ac.getBean("userServiceImpl");
        User user = uerService.queryById(1);
        System.out.println(user);
    }

    @Test
    public void test3(){
        uerService = (IUerService) ac.getBean("userServiceImpl");
        User user = new User();
        user.setName("vbvbv");
        user.setPwd("ppp");
        user.setAge(28);
        user.setSex("女");
        uerService.add(user);
        System.out.println(user);
    }

    @Test
    public void test4(){
        uerService = (IUerService) ac.getBean("userServiceImpl");
        User user = new User();
        user.setId(29);
        user.setName("bvbv");
        user.setPwd("qaq");
        user.setSex("女");
        user.setAge(26);
        uerService.update(user);
    }

    @Test
    public void test5(){
        uerService = (IUerService) ac.getBean("userServiceImpl");
        User user = new User();
        user.setId(29);
        uerService.delete(user);
    }
}