package by.epam.training.hometask03.dao;

import java.io.FileNotFoundException;

import by.epam.training.entity.Library;

public interface LibCreatorDAO {

	Library create() throws FileNotFoundException;

	void save(Library lib);

}
