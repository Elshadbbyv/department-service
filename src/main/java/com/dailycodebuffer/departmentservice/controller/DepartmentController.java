package com.dailycodebuffer.departmentservice.controller;

import com.dailycodebuffer.departmentservice.Entity.Department;
import com.dailycodebuffer.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@NoArgsConstructor
@AllArgsConstructor

@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    
    @GetMapping("/{id}")
    public Department findDepartmentId(@PathVariable("id") Long departmentId ){
        log.info("Inside findDepartmentId method of departmentId");
        return DepartmentService.findDepartmentById(departmentId);

    }
}
