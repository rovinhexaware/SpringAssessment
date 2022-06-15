package com.hexaware.SpringAssessment.Service;

import com.hexaware.SpringAssessment.Dao.BookDao;
import com.hexaware.SpringAssessment.Dao.LibraryDao;
import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DataServiceImplementation implements DataService{
//    @Autowired
    private LibraryDao libraryDao;

//    @Autowired
    private BookDao bookDao;

    @Autowired
    public DataServiceImplementation(LibraryDao libraryDao, BookDao bookDao) {
        this.libraryDao = libraryDao;
        this.bookDao = bookDao;
    }

    @Override
    public Books addBook(Books book) {
        return this.bookDao.save(book);
    }

    @Override
    public Library addLibrary(Library library) {
        return this.libraryDao.save(library);
    }

    @Override
    public Iterable<Books> getAllBooks(){
        return bookDao.findAll();
    }

    @Override
    public List<Library> getAllLibrary(){
        return libraryDao.findAll();
    }

    @Override
    public Library getLibraryById(int id){
        return libraryDao.findById(id).get();
    }

    @Override
    public List<Books> getByLibrary(Library library){
        return bookDao.getByLibrary(library);
    }

    @Override
    public List<Books> findAllGroupByLibrary(Library library){
        return bookDao.findAllGroupByLibrary(library);
    };

}
