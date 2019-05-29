package by.epam.training.hometask03.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.epam.training.entity.Library;

public interface LibCreatorDAO {

	Library create() throws FileNotFoundException, IOException;

	void save(Library lib);

}
