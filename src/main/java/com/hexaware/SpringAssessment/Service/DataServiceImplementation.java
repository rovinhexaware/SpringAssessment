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
    @Autowired
    private LibraryDao libraryDao;

    @Autowired
    private BookDao bookDao;

    @Override
    public Books addBook(Books book) {
        return this.bookDao.save(book);
    }

    @Override
    public Library addLibrary(Library library) {
        return this.libraryDao.save(library);
    }

    public Iterable<Books> getAllBooks(){
        return bookDao.findAll();
    }

    public List<Library> getAllLibrary(){
        return libraryDao.findAll();
    }

    public Library getLibraryById(int id){
        return libraryDao.getReferenceById(id);
    }

    public List<Books> getByLibrary(Library library){
        return bookDao.getByLibrary(library);
    }

    public List<Books> findAllGroupByLibrary(Library library){
        return bookDao.findAllGroupByLibrary(library);
    };

//    public long countBooks(){
//        return bookDao.findAllGroupByLibrary().stream().count();
//    }

}
