package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.entities.student;

public class studentdaoimpl implements studentdao {

	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {

		this.jdbctemplate = jdbctemplate;
	}

	public int insert(student std) {

		String query = "insert into student (id,name,city)values(?,?,?)";
		int r = jdbctemplate.update(query, std.getId(), std.getName(), std.getCity());
		return r;
	}

	public void change(student std) {
		String query = "update student set name = ?, city = ? where id = ?";
		this.jdbctemplate.update(query, std.getCity(), std.getName(), std.getId());

	}

	public student getstudent(int studentId) {

		String query = "select * from student where id = ?";
		RowMapper<student> rowmapper = new Rowmapperimpl();
		student students = this.jdbctemplate.queryForObject(query, rowmapper, studentId);
		return students;
	}

	public List<student> getsAllstudents() {
		// selecting multiple students
		String query = "select * from student";
		List<student> students = this.jdbctemplate.query(query, new Rowmapperimpl());
		return students;
	}

}
