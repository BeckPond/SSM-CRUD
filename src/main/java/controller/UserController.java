package controller;

import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IUerService;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUerService uerService;

    @RequestMapping("/query")
    public String query(Model model){
        List<User> list = uerService.queryAll();
        model.addAttribute("list",list);
        return "/home.jsp";
    }

    @RequestMapping("/queryById")
    public String queryById(User user,Model model){
        User u = uerService.queryById(user.getId());
        System.out.println("ById的："+u);
        model.addAttribute("user",u);
        return "/update.jsp";
    }

    @RequestMapping("/update")
    public String update(User user){
        uerService.update(user);
        return "query";
    }

    @RequestMapping("/add")
    public String add(User user){
        return "/update.jsp";
    }

    @RequestMapping("/delete")
    public String delete(User user){
        uerService.delete(user);
        System.out.println("delete的："+user);
        return "query";
    }
}
