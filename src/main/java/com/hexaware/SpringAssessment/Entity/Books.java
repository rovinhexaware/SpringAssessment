package com.hexaware.SpringAssessment.Entity;


import javax.persistence.*;

@Entity
public class Books {
    @Id
    private String bookId;

    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

    private String bookName;

    public Books(String bookId, Library libraryId, String bookName) {
        this.bookId = bookId;
        this.library = libraryId;
        this.bookName = bookName;
    }

    public Books() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getLibraryId() {
        return library.getLibraryId();
    }

    public void setLibraryId(Library libraryId) {
        this.library = libraryId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
