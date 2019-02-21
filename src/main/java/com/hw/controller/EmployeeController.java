package com.hw.controller;

import com.hw.entity.Employee;
import com.hw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/allEmp")
    public String allEmp(ModelMap modelMap){
        List<Employee> allEmp = employeeService.getAllEmp();
        //System.out.println(allEmp);
        modelMap.addAttribute("allEmp",allEmp);
        return "emplist";
    }

    @RequestMapping("/addEmp")
    public String addEmp(Employee employee){
        employeeService.addEmp(employee);
        return "redirect:/emp/allEmp";
    }

    @RequestMapping("/getEmpById")
    public String getEmpById(Integer id, Map map){
        Employee emp = employeeService.getEmpById(id);
        map.put("emp",emp);
        return "updateEmp";
    }


    @RequestMapping("/updateEmp")
    public String updateEmp(Employee employee){
        System.out.println(employee);
        employeeService.updateEmp(employee);
        return "redirect:/emp/allEmp";
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmp(Integer id){
        employeeService.deleteEmp(id);
        return "redirect:/emp/allEmp";
    }





}
