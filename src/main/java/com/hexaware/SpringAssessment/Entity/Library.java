package com.hexaware.SpringAssessment.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Library {
    @Id
    private int libraryId;

    @OneToMany( mappedBy = "library" )
    private List<Books> books;

    private String libraryName;

    public Library(int libraryId, String libraryName) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
    }

    public Library() {
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    @Override
    public String toString() {
        return "{" +
                "libraryId=" + libraryId +
                ", libraryName='" + libraryName + '\'' +
                '}';
    }
}
