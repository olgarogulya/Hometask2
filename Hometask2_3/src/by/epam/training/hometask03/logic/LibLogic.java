package by.epam.training.hometask03.logic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import by.epam.training.hometask03.entity.Book;
import by.epam.training.hometask03.entity.Book.SortType;

public interface LibLogic {

	void add(Book book) throws FileNotFoundException, IOException;
	void remove(Book book) throws FileNotFoundException, IOException;
	List<Book> find(String author, SortType type) throws FileNotFoundException, IOException;
	List<Book> findall() throws FileNotFoundException, IOException;
	List<Book> save() throws FileNotFoundException, IOException;
}
