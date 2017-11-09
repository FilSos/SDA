package com.sda.planer.planer.controller;

import com.sda.planer.planer.model.Employee;
import com.sda.planer.planer.repository.EmployeeRepository;
import com.sda.planer.planer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ModelAndView allEmployees() {

        ModelAndView modelAndView = new ModelAndView("employee");
        modelAndView.addObject("employee", employeeService.getAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getEmployee(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("employee");
        Employee employee = employeeService.getEmployee(id);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping
    public String saveUser(@ModelAttribute Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/employee";

    }


}
