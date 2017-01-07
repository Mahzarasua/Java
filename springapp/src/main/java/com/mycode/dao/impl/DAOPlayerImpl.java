package com.mycode.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycode.beans.Player;
import com.mycode.dao.DAOPlayer;

@Repository
public class DAOPlayerImpl implements DAOPlayer {

	@Autowired
	private DataSource dataSource;
	
	//@Override
	public void register(Player player) throws Exception {
		String sql = "insert into spring.player(name, team_id, shirt_id) values (?,?,?)";
		Connection con = null;
		
		try{
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, player.getName());
			ps.setInt(2, player.getTeam().getId());
			ps.setInt(3, player.getShirt().getId());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			throw e;
		}finally{
			if(con != null){
				con.close();
			}
		}
	}
	
}
