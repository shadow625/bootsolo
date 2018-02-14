package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MainController {
    public static void main(String[] args) {
        SpringApplication.run(MainController.class,args);
    }

    @RequestMapping("/")
    public String index(){
        System.out.println("dwdw");
        return "index";
    }
}
