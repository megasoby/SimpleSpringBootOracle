package com.example.myapp.controller;

import com.example.myapp.dao.DeptDao;
import com.example.myapp.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptDao deptDao;

    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptDao.selectList();
        return list;
    }
}
