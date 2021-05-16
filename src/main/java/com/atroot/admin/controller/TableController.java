package com.atroot.admin.controller;

import com.atroot.admin.bean.User;
import com.atroot.admin.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Description: table
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.7 13:11
 */
@Controller
public class TableController {
    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model) {
//        List<User> users = Arrays.asList(new User("zxc", "123456"), new User("zhangsan", "123456"));
//        if (users.size() >= 1) {
//            throw new UserTooManyException("用户太多啦！");
//        }
        List<User> list = userService.list();
        model.addAttribute("users", list);

//        current – 当前页
//        size – 每页显示条数
        Page<User> userPage = new Page<>(pn,2);
        Page<User> page = userService.page(userPage, null);

        model.addAttribute("page",page);
        return "table/dynamic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String delete(@PathVariable("id") Long id,
                         @RequestParam("pn") Integer pn,
                         RedirectAttributes requestAttribute){
        userService.removeById(id);
        requestAttribute.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table() {
        return "table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }
}
