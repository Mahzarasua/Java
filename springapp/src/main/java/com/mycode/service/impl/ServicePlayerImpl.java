package com.mycode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycode.beans.Player;
import com.mycode.dao.DAOPlayer;
import com.mycode.service.ServicePlayer;

@Service
public class ServicePlayerImpl implements ServicePlayer {

	@Autowired
	private DAOPlayer daoPlayer;

	public void register(Player player) throws Exception {
		try {
			daoPlayer.register(player);
		} catch (Exception e) {
			throw e;
		}

	}

}
