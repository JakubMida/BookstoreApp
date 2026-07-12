package bookstore.repository.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import bookstore.model.Book;
import bookstore.model.Bookstore;

import java.util.List;

public interface BookstoreRepository extends JpaRepository<Bookstore, Integer> {
    List<Bookstore> findAllByNameContaining(String name);

    @Query("select b from Bookstore b inner join b.books books where books=:books")
    List<Bookstore> findAllByBook(@Param("book") Book book);
}
