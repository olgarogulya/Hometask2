package by.epam.training.hometask03.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

//Создайте консольное приложение Library (Библиотека), содержащий список книг. Реализуйте методы добавления, удаления и поиска книги. Добавьте в приложение Library добавить возможность поиска книг определенного автора с их сортировкой a) по стоимости, b) по дате выхода. Самостоятельно разберитесь с классом (классами) в Java, позволяющими читать символьные данные из файла. Создайте файл, содержащий информацию о книгах из библиотеки, прочитайте его, и на основе прочитанной информации создайте коллекцию книг

import java.util.List;

import by.epam.training.hometask03.entity.Book;
import by.epam.training.hometask03.logic.LibLogic;
import by.epam.training.hometask03.logic.LibLogicImpl;

public class Main {

	public static void main(String[] args) throws IOException {
		LibLogic logic = new LibLogicImpl();
		Book newbook1 = new Book("NewBook1", "NewAuthor1", 999, 2020);
		Book newbook2 = new Book("NewBook2", "NewAuthor2", 888, 2019);
		Book newbook3 = new Book("NewBook3", "NewAuthor3", 777, 2018);
		print(logic.findall());
		//System.out.println(logic);
		 logic.add(newbook1);
		 logic.add(newbook2);
		 logic.add(newbook3);
		 logic.findall();
		 
		 logic.find("Ekkel", SortType.BY_PRICE);
		 logic.remove(newbook2);
		
	
	//System.out.println("lib " + logic);
	}

	public static void print(List<Book> books) {

		
		System.out.println(Arrays.toString(books.toArray()));
	/*for (int i = 0; i < books.size(); i++) {
		System.out.println(books.get(i).getAuthor());
	}*/
/*	for(Book book : books) {	
		System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPrice() + " " + book.getYearPublished());
		}*/
	}
}
