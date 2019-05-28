package by.epam.training.hometask03.main;

import java.io.FileNotFoundException;
import java.util.Arrays;

//�������� ���������� ���������� Library (����������), ���������� ������ ����. ���������� ������ ����������, �������� � ������ �����. �������� � ���������� Library �������� ����������� ������ ���� ������������� ������ � �� ����������� a) �� ���������, b) �� ���� ������. �������������� ����������� � ������� (��������) � Java, ������������ ������ ���������� ������ �� �����. �������� ����, ���������� ���������� � ������ �� ����������, ���������� ���, � �� ������ ����������� ���������� �������� ��������� ����

import java.util.List;

import by.epam.training.hometask03.entity.Book;
import by.epam.training.hometask03.logic.LibLogic;
import by.epam.training.hometask03.logic.LibLogicImpl;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		LibLogic logic = new LibLogicImpl();
		Book newbook = new Book("NewBook", "NewAuthor", 999, 2020);
		
		//System.out.println(logic);
		 logic.add(newbook);
	//	 logic.find(author, type);
	//	 logic.remove(book);
		// vernut vse knigi
	
	//System.out.println("lib " + logic);
	}

	public static void print(List<Book> books) {

	//for (int i = 0; i < books.size(); i++) {
	for(Book book : books) {	
		System.out.println(book.getTitle());
		}
	}
}