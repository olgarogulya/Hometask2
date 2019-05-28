package by.epam.training.hometask03.dao;

import java.io.FileNotFoundException;

import by.cdp.library.entity.Library;

public interface LibCreatorDAO {

	Library create() throws FileNotFoundException;

	void save(Library lib);

}