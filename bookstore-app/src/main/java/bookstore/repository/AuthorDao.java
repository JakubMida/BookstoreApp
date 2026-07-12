package bookstore.repository;

import bookstore.model.Author;

import java.util.List;

public interface AuthorDao {

    List<Author> findAll();

    Author findById(int id);

    Author add(Author a);


}
