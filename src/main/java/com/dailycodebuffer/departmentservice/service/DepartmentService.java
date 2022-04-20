package com.dailycodebuffer.departmentservice.service;

import com.dailycodebuffer.departmentservice.Entity.Department;
import com.dailycodebuffer.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

@Slf4j
public class DepartmentService {

    @Autowired
    private static DepartmentRepository departmentRepository;



    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }
    public static Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);

    }
}
