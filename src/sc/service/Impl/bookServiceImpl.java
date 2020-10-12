package sc.service.Impl;

import sc.dao.impl.bookDaoIMpl;
import sc.entity.book;
import sc.service.bookService;

import java.util.List;

public class bookServiceImpl implements bookService {

    private bookDaoIMpl bdl=new bookDaoIMpl();
    @Override
    public List<book> bookfindstate() throws Exception {
        return bdl.bookfindstate();
    }

    @Override
    public book findbook_name(int book_id) throws Exception {
        return bdl.findbook_name(book_id);
    }

    @Override
    public int bookupdate(book b) throws Exception {
        return bdl.bookupdate(b);
    }
}
