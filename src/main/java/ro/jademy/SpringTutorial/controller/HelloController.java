package ro.jademy.SpringTutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")   //www.jademy.com/
    public String index() {
        return "Greetings index";
    }

//    @RequestMapping("/hello")   //www.jademy.com/hello
//    public String hello() {
//        return "Greetings";
//    }
}
