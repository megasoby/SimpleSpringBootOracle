package com.example.myapp.service;

import com.example.myapp.dao.DeptDao;
import com.example.myapp.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;

    @Override
    public List<Dept> selectList() {
        return deptDao.selectList();
    }
}
