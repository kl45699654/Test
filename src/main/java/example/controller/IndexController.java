package example.controller;

import example.object.Admin;
import example.object.User;
import example.object.UserListForm;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: springssm
 * @description: ceshi
 * @author: Mr.Shu
 * @create: 2018-04-02 15:52
 **/
@Controller
public class IndexController {
    @RequestMapping(value = "baseType.do")
    @ResponseBody
    public String beseType(int age) {
        return "age:"+age;
    }
    @RequestMapping(value = "object.do")
    @ResponseBody
    public String object(User user, Admin admin) {
        return user.toString()+" "+admin.toString();
    }
    @InitBinder("user")
    public void  initUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user.");

    }
    @InitBinder("admin")
    public void  initAdmin(WebDataBinder binder){
        binder.setFieldDefaultPrefix("admin.");

    }
    @RequestMapping(value = "list.do")
    @ResponseBody
    public String list(UserListForm userListForm) {
        return userListForm.toString();
    }
}
