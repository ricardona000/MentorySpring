package mentory.springboot.controller;

import mentory.springboot.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1, "Master Spring", "Ranga"),
                new Book(2, "SpringBoot", "Spring Initializer"));
    }

}
