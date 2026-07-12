package bookstore.repository;

import bookstore.model.Bookstore;
import bookstore.model.Author;
import bookstore.model.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAll();

    Book findById(int id);

    List<Book> findByAuthor(Author a);

    List<Book> findByBookstore(Bookstore b);

    Book add(Book m);

}
