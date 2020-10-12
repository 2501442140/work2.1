package sc.dao;

import sc.entity.book;

import java.util.List;

public interface bookDao {
   public List<book> bookfindstate()throws Exception;

   public book findbook_name(int  book_id)throws Exception;

   public int bookupdate(book b)throws Exception;
}
