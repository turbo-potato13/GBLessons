package lesson25.services;

import com.vtb.kortunov.lesson25.entities.Book;
import com.vtb.kortunov.lesson25.exceptions.ResourceNotFoundException;
import com.vtb.kortunov.lesson25.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Page<Book> findAll(Specification<Book> spec, int page, int size) {
        return bookRepository.findAll(spec, PageRequest.of(page, size));
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book with id: " + id + " not found"));
    }

    public Book findByTitle(String title) {
        return bookRepository.findOneByTitle(title);//.orElseThrow(() -> new ResourceNotFoundException("Book with id: " + id + " not found"));
    }

    public Book saveOrUpdate(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
