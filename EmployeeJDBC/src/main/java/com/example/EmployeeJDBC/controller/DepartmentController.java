package com.example.EmployeeJDBC.controller;

import com.example.EmployeeJDBC.model.Department;
import com.example.EmployeeJDBC.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository deptRep;

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return deptRep.findAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDeptById(@PathVariable int id){
        Department d = deptRep.getOneById(id);
        return d;

    }

    @PostMapping("/departments")
    public void createNewDepartment(@RequestBody Department department){
        deptRep.saveNewDepartment(department);
    }

}
