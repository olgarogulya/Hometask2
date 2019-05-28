package by.epam.training.hometask03.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import by.epam.training.hometask03.dao.LibCreatorDAO;
import by.epam.training.hometask03.entity.Book;
import by.epam.training.hometask03.entity.Library;

public class FileLibCreatorDAO implements LibCreatorDAO {

	public Library create() throws FileNotFoundException {
		Library lib = new Library();

		File file = new File("D:/Java_training/eclipse_workspace/Lesson15library/resources/books.txt");
		Scanner sc = new Scanner(file);
	//	System.out.println(file);

		while(sc.hasNextLine()) {
			
			String text = sc.nextLine();
			//System.out.println("text " + text);

			String[] line = text.split("\r\n|\r|\n");
		//	System.out.println("line.length " + line.length);

			for(int a = 0; a < line.length; a++) {

				String[] str;
				String title;
				String author;
				int price;
				int yearPublished;
				String delimiter="\\s";
				str = line[a].split(delimiter);
		//		System.out.println("line" + a + "=" + line[a]);
				
				//for(int i = 0; i < str.length; i++) {
			//	System.out.print("str" + i + "=" + str[i]);
				title = str[0];
				author = str[1];
				price = Integer.parseInt(str[2]);
				yearPublished = Integer.parseInt(str[3]);
				//System.out.println();
			//	System.out.println("title - " + title + ", author - " + author + ", price - " + price + ", yearPublished - " + yearPublished);
			//}
			//	System.out.println("-------");
				
			Book book = new Book(title, author, price, yearPublished);
			lib.add(book);
			//System.out.println(lib);
			}

			}
		System.out.println(lib);
		return lib;
	}

	@Override
	public void save(Library lib) {

	}

}