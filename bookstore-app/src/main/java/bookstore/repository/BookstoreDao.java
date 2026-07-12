package bookstore.repository;

import bookstore.model.Bookstore;
import bookstore.model.Book;

import java.util.List;

public interface BookstoreDao {

    List<Bookstore> findAll();

    Bookstore findById(int id);

    List<Bookstore> findByBook(Book b);

    Bookstore save(Bookstore bookstore);
}
