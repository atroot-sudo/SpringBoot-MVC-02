package com.atroot.admin.controller;

import com.atroot.admin.bean.Account;
import com.atroot.admin.bean.City;
import com.atroot.admin.bean.User;
import com.atroot.admin.service.AccountService;
import com.atroot.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Description: Index的controller
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.7 8:56
 */
@Controller
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;

    @ResponseBody
    @PostMapping("/insert")
    public City insert(City city) {
        cityService.insert(city);
        return city;
    }

    @ResponseBody
    @GetMapping("/getCity")
    public City getCityById(@RequestParam("id") Long id) {
        return cityService.getCityById(id);
    }

    @ResponseBody
    @GetMapping("/getAcc")
    public Account getUser(@RequestParam("id") int id) {
        return accountService.getAccountById(id);
    }

    @GetMapping({"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @ResponseBody
    @GetMapping("/sql")
    public String query() {
        Integer integer = jdbcTemplate.queryForObject("select count(*) from user", int.class);
        return integer.toString();
    }

    @PostMapping("/login")
    public String main(User user, Model model, HttpSession session) {
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "login";
        }
        //登陆成功后重定向到main.html,防止表单的重复提交问题

    }

    @GetMapping("/main.html")
    public String mainPage(User user, Model model, HttpSession session) {
        //判断登录状态，防止直接访问
//        if (session.getAttribute("loginUser") != null) {
//            return "main";
//        } else {
//            model.addAttribute("msg", "未登录！");
//            return "login";
//        }
        return "main";
    }


}
