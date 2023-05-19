package com.ritwik.bookManager;

public class BookService {

    BookRepository bookRepository = new BookRepository();
    public String addBook(Book book) {
        bookRepository.add(book);

        return "book entered with id: "+book.getId();
    }
}
