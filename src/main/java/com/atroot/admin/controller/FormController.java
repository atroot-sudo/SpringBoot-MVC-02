package com.atroot.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Description: FormController
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.9 20:45
 */
@Controller
@Slf4j
public class FormController {
    @GetMapping("/form_layouts")
    public String form_layouts() {
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestParam("password") String password,
                         @RequestPart("headPhoto") MultipartFile headPhoto, //文件用RequestPart()
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("email:{},username:{},password:{},headPhoto:{}", email, username, password, headPhoto);
        for (MultipartFile multipartFile : photos) {
            if (!multipartFile.isEmpty()) {
                String originalFilename = multipartFile.getOriginalFilename(); //获取原始文件名
                log.info("photos:{}", originalFilename);
                multipartFile.transferTo(new File("D:\\zyd\\" + originalFilename)); //将文件直接上传到指定的位置
            }
        }
        if (!headPhoto.isEmpty()) {
            headPhoto.transferTo(new File("D:\\zyd\\" + headPhoto.getOriginalFilename()));
        }
        return "main";
    }
}