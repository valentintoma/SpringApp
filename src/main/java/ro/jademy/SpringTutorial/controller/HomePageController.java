package ro.jademy.SpringTutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomePage() {
        return "home";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getEmployeePage() {

        return "home:employee";

    }

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public String getDepartmentPage() {

        return "home:departments";

    }
}
