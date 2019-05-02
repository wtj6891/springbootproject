package com.hello.springbootproject.web;

import com.hello.springbootproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/******
 *Name: WelcomeController
 *User: Administrator
 *Date: 2019/5/2
 **/

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "www.baidu.com");
        List<User> list = new ArrayList<User>();
        User user1 = new User();
        user1.setName("zhang san");
        user1.setAge(28);
        user1.setPass("Pass");
        list.add(user1);
        User user2 = new User();
        user2.setName("wang wu");
        user2.setAge(56);
        user2.setPass("Pass");
        list.add(user2);
        User user3 = new User();
        user3.setName("ling wu");
        user3.setAge(70);
        user3.setPass("Pass");
        list.add(user3);
        model.put("list", list);
        return "welcome";
    }

    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Model model) {
        if(file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            model.addAttribute("message", "Please select a file to upload");
            return "uploadStatus";
        }
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("E:/test/" + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message", "You success upload " + file.getOriginalFilename());
            model.addAttribute("message", "You success upload " + file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "uploadStatus";
    }
}
