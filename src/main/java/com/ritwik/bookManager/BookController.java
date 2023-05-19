package com.ritwik.bookManager;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {

    private BookService bookService = new BookService();

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book){
//        bookData.put(book.getId(), book);
        return bookService.addBook(book);
    }
//
//    @GetMapping("/get-book")
//    public Book getBook(@RequestParam Integer id){
//        return bookData.get(id);
//    }
//
//    @GetMapping("/get-all-books")
//    public List<Book> getAllBook(){
//        return new ArrayList<>(bookData.values());
//    }
//
//    @GetMapping("/get-book-by-name/{name}") // get-book-by-name/harry-potter
//    public Book getBookByName(@PathVariable String name){
//        for(Map.Entry<Integer,Book> entry : bookData.entrySet()){
//            if(entry.getValue().getTitle().equals(name)){
//                return entry.getValue();
//            }
//        }
//        return null;
//    }
//
//
//    @PutMapping("/update-book-page") //update-book-page?id=1&pages=500
//    public Book updateBookPage(@RequestParam Integer id, @RequestParam Integer pages){
//        Book book = bookData.get(id);
//        book.setPages(pages);
//        bookData.put(id,book);
//        return book;
//    }
//
//    /*@PutMapping("/update-book-page") //update-book-page/1&pages=500
//    public Book updateBookPage(@PathVariable Integer id, @RequestParam Integer pages){
//        Book book = bookData.get(id);
//        book.setPages(pages);
//        bookData.put(id,book);
//        return book;
//    }*/
//    @DeleteMapping("/delete-book")
//    public String deleteBook(@PathVariable Integer id){
//        bookData.remove(id);
//        return "Book deleted with id: " + id;
//    }
}
