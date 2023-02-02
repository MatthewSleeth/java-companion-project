package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.Game;
import com.organization.mvcproject.repository.MockGameDAO;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private MockGameDAO gameDao;

	@Override
	public List<Game> retrieveAllGames() {
		return gameDao.retrieveAllGames();
	}

	@Override
	public Game saveGame(Game game) {
		return gameDao.saveGame(game);
	}
	
	@Override
	public Game updateGame(Game game) {
		return gameDao.updateGame(game);
	}

	@Override
	public Boolean deleteGame(Long gameId) {
		return gameDao.deleteGame(gameId);
	}

}