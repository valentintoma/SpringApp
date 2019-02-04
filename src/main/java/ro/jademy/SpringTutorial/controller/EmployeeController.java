package ro.jademy.SpringTutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.SpringTutorial.repository.EmployRepository;

@Controller
public class EmployeeController {

    @Autowired
    private EmployRepository employRepo;

    @RequestMapping("/employee/all")
    public String getAllEmployees(Model model) {

        model.addAttribute ( "employees", employRepo.findAll () );

        return "employees";
    }

//    @RequestMapping("/home")
//    public  String

    //TODO Pagina de start   // HOME PAGE - Employees  - link to - /employeesAll & Departments - link to /departments
    // fiecare empl sa fie link catre informatii despre emp

    //Model Departments - list of employees
    //relatii intre tabele @OneToMany(pivotul ca parametru ..)


}
