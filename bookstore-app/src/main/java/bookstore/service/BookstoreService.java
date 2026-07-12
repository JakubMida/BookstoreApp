package bookstore.service;

import bookstore.model.Bookstore;
import bookstore.model.Book;

import java.util.List;

public interface BookstoreService {
//api zwraca nam wszystkie kina
    Bookstore getBookstoresById(int id);

    List<Bookstore> getAllBookstores();

    List<Bookstore> getBookstoresByBook(Book b);

    List<Book> getBooksInBookstores(Bookstore b);

    Bookstore addBookstore(Bookstore b);
}
