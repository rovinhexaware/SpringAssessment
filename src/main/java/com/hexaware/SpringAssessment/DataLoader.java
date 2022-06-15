package com.hexaware.SpringAssessment;

import com.hexaware.SpringAssessment.Dao.BookDao;
import com.hexaware.SpringAssessment.Dao.LibraryDao;
import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//@Component
public class DataLoader {
    private BookDao bookEntity;
    private LibraryDao libraryEntity;

    @Autowired
    public DataLoader(BookDao bookEntity,LibraryDao libraryEntity){
        this.bookEntity = bookEntity;
        this.libraryEntity = libraryEntity;
    }

    @PostConstruct
    private void loadData(){

        bookEntity.deleteAll();
        libraryEntity.deleteAll();

        // create an author
        Library library101 = new Library(101, "Reston Library");
        Library library102 = new Library(102, "Gum Spring Library");
        libraryEntity.save(library101);
        libraryEntity.save(library102);

        // create some posts
        List<List<String>> description101 = Arrays.asList(Arrays.asList("85u9dd", "The Lord of the Rings by J. R. R. Tolkien"), Arrays.asList("1948uk", "The 7 Habits of Highly Effective People"), Arrays.asList("Ijhu786", "The Power of Positive Thinking"));
        List<List<String>> description102 = Arrays.asList(Arrays.asList("98jkuiy", "How to Win Friends & Influence People"));
        createBooks(library101, description101 );
        createBooks(library102, description102 );

    }

    private void createBooks(Library id, List<List<String>> description101) {

        description101.stream().forEach((book) -> {
            Books newBook = new Books(book.get(0), id, book.get(1));
            bookEntity.save(newBook);
        });

    }
}
