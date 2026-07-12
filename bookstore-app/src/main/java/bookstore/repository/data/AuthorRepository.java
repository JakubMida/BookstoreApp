package bookstore.repository.data;

import org.springframework.data.jpa.repository.JpaRepository;
import bookstore.model.Author;

public interface AuthorRepository
    extends JpaRepository<Author, Integer> {
}
