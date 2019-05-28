package by.epam.training.hometask03.dao;

import by.epam.training.hometask03.dao.impl.FileLibCreatorDAO;

public class DAOProvider {
	private final static DAOProvider instance = new DAOProvider();

	private DAOProvider() {
	}

	private final LibCreatorDAO creatorDAO = new FileLibCreatorDAO();

	public static DAOProvider getInstance() {
		return instance;
	}

	public LibCreatorDAO getLibCreatorDAO() {
		return creatorDAO;
	}

}