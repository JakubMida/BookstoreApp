package bookstore.repository.data;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import bookstore.model.Author;
import bookstore.model.Book;
import bookstore.model.Bookstore;
import bookstore.repository.BookDao;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Primary
public class DataBookDao implements BookDao {
    private final BookRepository repository;

    @Override
    public List<Book> findAll(){return repository.findAll();}

    @Override
    public Book findById(int id){return repository.findById(id).orElse(null);}

    @Override
    public List<Book> findByAuthor(Author a){return repository.findAllByAuthor(a); }

    @Override
    public List<Book> findByBookstore(Bookstore b){return repository.findAllByBookstoresContaining(b);}

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public Book add(Book b){return repository.save(b);}
}
