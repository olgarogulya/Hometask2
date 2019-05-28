package by.epam.training.hometask03.logic;

import java.io.FileNotFoundException;
import java.util.List;

import by.epam.training.hometask03.entity.Book;
import by.epam.training.hometask03.entity.Book.SortType;

public interface LibLogic {

	void add(Book book) throws FileNotFoundException;
	void remove(Book book) throws FileNotFoundException;
	List<Book> find(String author, SortType type) throws FileNotFoundException;
	List<Book> findall() throws FileNotFoundException;
}
