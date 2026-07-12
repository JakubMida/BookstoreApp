package bookstore.repository.data;

import org.springframework.data.jpa.repository.JpaRepository;
import bookstore.model.Author;
import bookstore.model.Book;
import bookstore.model.Bookstore;

import java.util.List;

public interface
BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAllByAuthor(Author a);

    List<Book> findAllByBookstoresContaining(Bookstore b);
}
