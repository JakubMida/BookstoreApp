package bookstore.repository.dummy;

import org.springframework.stereotype.Component;
import bookstore.model.Book;
import bookstore.model.Bookstore;
import bookstore.repository.BookstoreDao;

import java.util.List;


public class DummyBookstoreDao implements BookstoreDao {
    @Override
    public List<Bookstore> findAll() {return List.of();}
    @Override
    public Bookstore findById(int id){return null;}
    @Override
    public List<Bookstore> findByBook(Book b){return List.of();}

    @Override
    public Bookstore save(Bookstore b){return null;}
}
