package bookstore;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import bookstore.model.Bookstore;
import bookstore.service.BookstoreService;

import java.util.List;

@Component
@Slf4j
public class BookstoreComponent {

    private final BookstoreService bookstoreService;

    public BookstoreComponent(BookstoreService bookstoreService){this.bookstoreService = bookstoreService;}

    @PostConstruct
    void init(){
        List<Bookstore> bookstores = bookstoreService.getAllBookstores();
        log.info("{} bookstores found", bookstores.size());
        bookstores.forEach(bookstore -> log.info("{}", bookstore));
    }
}

