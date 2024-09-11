package com.example.lab3_20190803.controllers;

import com.example.lab3_20190803.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping( value ={"employee/list"})
    public String listarEmpleados (Model model) {
        model.addAttribute("employees" , employeeRepository.findAll());
        return "employee/lista";

    }
    @GetMapping(value = "employee/editar")
    public String editarEmpleados (Model model, @PathVariable int id) {
        model.addAttribute("employees", employeeRepository.findById(id));
        return "employee/editar";
    }


    @GetMapping(value = {"empployee/historial"})
    public String historial(Model model) {
        model.addAttribute("employee" , employeeRepository.findAll());
        return "employee/historial";

    }




    @GetMapping(value = "employee/delete/{id}")
    public String borrarEmpleado (@PathVariable("id") int id){
        employeeRepository.deleteById(id);
        return "redirect:/employee/list";
    }


}
