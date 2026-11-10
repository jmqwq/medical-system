package com.example.medicalsystem.controller;
import com.example.medicalsystem.entity.Department;
import com.example.medicalsystem.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin // 允许跨域请求
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return departmentMapper.selectList(null);
    }
}