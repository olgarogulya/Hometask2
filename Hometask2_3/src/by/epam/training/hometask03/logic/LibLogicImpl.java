package by.epam.training.hometask03.logic;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epam.training.hometask03.logic.LibLogic;
import by.epam.training.hometask03.logic.comparator.BookByPriceComparator;
import by.epam.training.hometask03.logic.comparator.BookByYearPublishedComparator;
import by.epam.training.hometask03.dao.DAOProvider;
import by.epam.training.hometask03.dao.LibCreatorDAO;
import by.epam.training.hometask03.dao.impl.FileLibCreatorDAO;
import by.epam.training.hometask03.entity.Book;
import by.epam.training.hometask03.entity.Book.SortType;
import by.epam.training.hometask03.entity.Library;;

public class LibLogicImpl implements LibLogic {

	@Override
	public void add(Book book) throws FileNotFoundException {

		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO(); 

		Library lib = libDAO.create();
		lib.add(book);
		libDAO.save(lib);

	}

	@Override
	public void remove(Book book) throws FileNotFoundException {
		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO();
		Library lib = libDAO.create();
		lib.remove(book);
		libDAO.save(lib);

	}

	@Override
	public List<Book> find(String author, SortType type) throws FileNotFoundException {
		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO();

		Library lib = libDAO.create();
		List<Book> results = new ArrayList<Book>();
		
		for (int i = 0; i<results.size(); i++) {
		//	System.out.println(lib.getbooks());
		}
		
		

		if (type == Book.SortType.BY_PRICE) {
			Collections.sort(results, new BookByPriceComparator());
		} else if (type == Book.SortType.BY_YEAR_PUBLISHED) {
			Collections.sort(results, new BookByYearPublishedComparator());
		}

		return results;
	}

	@Override
	public List<Book> findall() throws FileNotFoundException {
		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO();

		Library lib = libDAO.create();
		List<Book> allbooks = new ArrayList<Book>();
		
		return allbooks;
	}

}
