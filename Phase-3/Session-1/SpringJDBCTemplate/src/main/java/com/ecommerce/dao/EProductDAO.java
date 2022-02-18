package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProductEntity;

public class EProductDAO {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<EProductEntity> getProducts()
	{
		return template.query("select * from eproduct", new RowMapper<EProductEntity>() {

			public EProductEntity mapRow(ResultSet rs, int row) throws SQLException {
				EProductEntity pro= new EProductEntity();
				pro.setID(rs.getInt(1));
				pro.setName(rs.getString(2));
				pro.setPrice(rs.getBigDecimal(3));
				pro.setDateAdded(rs.getDate(4));
				return pro;
			}});
	}
}
