package com.hexaware.SpringAssessment.Dao;

import com.hexaware.SpringAssessment.Entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryDao extends JpaRepository<Library, Integer> {

}
