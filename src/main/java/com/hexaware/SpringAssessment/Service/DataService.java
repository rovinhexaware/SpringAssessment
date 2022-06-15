package com.hexaware.SpringAssessment.Service;

import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;

import java.util.List;


public interface DataService {
    Books addBook(Books book);
    Library addLibrary(Library library);
    Iterable<Books> getAllBooks();
}
