package com.atroot.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description: FormController
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.9 20:45
 */
@Controller
public class FormController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
}
