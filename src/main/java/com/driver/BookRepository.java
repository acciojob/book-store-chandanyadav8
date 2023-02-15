package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    ArrayList<Book>bookDb;
    private int id;

    public BookRepository(){
        bookDb=new ArrayList<>();
        id=1;
    }

    public Book save(Book book){
        book.setId(id++);
        bookDb.add(book);
        return book;
    }

    public Book findBookById(int id){
        for(Book i:bookDb)
        {
            if(i.getId()==id)
            {
                return i;
            }
        }

        return null;
    }

    public List<Book> findAll(){
        return bookDb;
    }

    public void deleteBookById(int id){
        for(Book i:bookDb)
        {
            if(i.getId()==id)
            {
               bookDb.remove(i);
            }
        }
       return;
    }

    public void deleteAll(){
        bookDb.clear();
        return;
    }

    public List<Book> findBooksByAuthor(String author){
        ArrayList<Book>ans=new ArrayList<>();
        for(Book i:bookDb)
        {
            if(i.getAuthor().equals(author))
            {
                ans.add(i);
            }
        }
        return ans;
    }

    public List<Book> findBooksByGenre(String genre){
        ArrayList<Book>ans=new ArrayList<>();
        for(Book i:bookDb)
        {
            if(i.getAuthor().equals(genre))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
