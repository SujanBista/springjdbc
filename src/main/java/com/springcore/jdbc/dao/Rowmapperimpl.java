package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springcore.jdbc.entities.student;

public class Rowmapperimpl implements RowMapper<student> {

	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student stdent = new student();
		stdent.setId(rs.getInt(1));
		stdent.setName(rs.getString(2));
		stdent.setCity(rs.getString(3));
		return stdent;
	}

}
