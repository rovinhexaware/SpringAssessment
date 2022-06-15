package com.hexaware.SpringAssessment.Service;

import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;

import java.util.List;


public interface DataService {
    Books addBook(Books book);
    Library addLibrary(Library library);
    Iterable<Books> getAllBooks();
    public List<Library> getAllLibrary();
    public Library getLibraryById(int id);
    public List<Books> getByLibrary(Library library);
    public List<Books> findAllGroupByLibrary(Library library);
}
