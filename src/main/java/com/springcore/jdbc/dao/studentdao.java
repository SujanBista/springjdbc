package com.springcore.jdbc.dao;
import java.util.List;

import com.springcore.jdbc.entities.student;

public interface studentdao {
public int insert(student std);
public void change(student std);
public student getstudent(int studentId);
public List<student> getsAllstudents();
}
