package sc.service;

import sc.entity.book;

import java.util.List;

public interface bookService {

    public List<book> bookfindstate()throws Exception;

    public book findbook_name(int book_id)throws Exception;

    public int bookupdate(book b)throws Exception;
}
