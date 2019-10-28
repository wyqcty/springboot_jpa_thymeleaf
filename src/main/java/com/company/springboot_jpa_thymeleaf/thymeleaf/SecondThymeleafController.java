package com.company.springboot_jpa_thymeleaf.thymeleaf;

import com.company.springboot_jpa_thymeleaf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String indexPage(Model model) {
        // 普通文本
        String message = "Hello, Thymeleaf!";

        User u = new User();
        u.setId(1L);
        u.setName("优就业");
        u.setAge(18);

        Map<String,Object> map=new HashMap<>();
        map.put("img1","4.jpg");
        map.put("img2","5.jpg");

        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }


    @GetMapping("/three")
    public String indexPage2(Model model) {

        List<User> list=new ArrayList<User>();

        User u1 = new User();
        u1.setId(1L);
        u1.setName("优就业");
        u1.setAge(18);
        list.add(u1);

        User u2 = new User();
        u2.setId(2L);
        u2.setName("中公教育");
        u2.setAge(28);
        list.add(u2);

        User u3 = new User();
        u3.setId(3L);
        u3.setName("IT先锋");
        u3.setAge(88);
        list.add(u3);

        User u4 = new User();
        u4.setId(4L);
        u4.setName("JAVA第一");
        u4.setAge(888);
        list.add(u4);

        model.addAttribute("userList", list);
        return "index3";
    }

    @GetMapping("/four")
    public String indexPage3(Model model) {

        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }

    @GetMapping("/five")
    public String indexPage5(Model model) {
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index5";
    }

    @GetMapping("/six")
    public String indexPage6(Model model) {
        return "index6";
    }



    @GetMapping("/seven")
    public String indexPage7(Model model) {
        //日期时间
        Date date = new Date();
        model.addAttribute("date", date);


        //小数的金额
        double price=128.5678D;

        model.addAttribute("price", price);

        //定义大文本数据
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;

        model.addAttribute("str1", str);

        //定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2", str2);

        return "index7";
    }

}
