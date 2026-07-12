package bookstore.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import bookstore.service.BookService;

@Component
@RequiredArgsConstructor
public class BookstoreInfoContributor implements InfoContributor {
    private final BookService bookService;

    @Override
    public void contribute(Info.Builder builder){
        builder.withDetail("books", bookService.getAllBooks().size());
    }
}
