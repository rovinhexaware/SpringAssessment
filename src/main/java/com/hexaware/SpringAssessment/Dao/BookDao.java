package com.hexaware.SpringAssessment.Dao;

import com.hexaware.SpringAssessment.Entity.Books;
import com.hexaware.SpringAssessment.Entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Books, Integer> {
    List<Books> getByLibrary(Library library);
    List<Books> findAllGroupByLibrary(Library library);
//    List<Object> findAllGroupByLibraryCount(Library library);
}
