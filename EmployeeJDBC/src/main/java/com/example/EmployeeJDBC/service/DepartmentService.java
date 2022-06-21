package com.example.EmployeeJDBC.service;


import com.example.EmployeeJDBC.model.Department;
import com.example.EmployeeJDBC.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository deptRep;

    public List<Department>getAllDepartment(){
        List<Department>depts =deptRep.findAllDepartments();
        if(depts.isEmpty()){
            return new ArrayList<>();
        }
        return depts;
    }

}
