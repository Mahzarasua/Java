package com.mycode.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycode.beans.Brand;
import com.mycode.dao.DAOBrand;

@Repository
public class DAOBrandImpl implements DAOBrand {

	@Autowired
	private DataSource dataSource;

	public void register(Brand brand) throws Exception {
		String sql = "insert into spring.brand(name) values (?)";
		Connection con = null;

		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, brand.getName());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

}
