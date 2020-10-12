package sc.dao.impl;

import sc.basedao.BaseDao;
import sc.dao.bookDao;
import sc.entity.book;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class bookDaoIMpl extends BaseDao implements bookDao {

    @Override
    public List<book> bookfindstate() throws Exception {
        List<book> list=new ArrayList<>();
        String sql="select * from book where state=0";
        ResultSet rs=exeuQuery(sql,null);
        book bk=null;
        while(rs.next()){
            bk=new book();
            bk.setBook_id(rs.getInt(1));
            bk.setBook_name(rs.getString(2));
            bk.setBook_author(rs.getString(3));
            bk.setBook_concern(rs.getString(4));
            bk.setConcern_time(rs.getDate(5));
            bk.setState(rs.getInt(6));
            bk.setLender(rs.getString(7));
            list.add(bk);
        }
        getClose();
        return list;
    }

    @Override
    public book findbook_name(int book_id) throws Exception {
        String sql="select * from book where book_id=?";
        Object [] obj={book_id};
        ResultSet rs=exeuQuery(sql,obj);
        book bk=new book();
        while (rs.next()) {
            bk.setBook_id(rs.getInt(1));
            bk.setBook_name(rs.getString(2));
            bk.setBook_author(rs.getString(3));
            bk.setBook_concern(rs.getString(4));
            bk.setConcern_time(rs.getDate(5));
            bk.setState(rs.getInt(6));
            bk.setLender(rs.getString(7));
        }
        getClose();
        return bk;
    }

    @Override
    public int bookupdate(book b) throws Exception {
        int x=-1;
        String sql="update  book set lender=?,state=? where book_id=? ";
        Object []obj={b.getLender(),b.getState(),b.getBook_id()};
        x=exeuUpdate(sql,obj);
        return x;
    }
}
