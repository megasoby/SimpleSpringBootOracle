package com.example.myapp.dao;

import com.example.myapp.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public List<Dept> selectList();
}
