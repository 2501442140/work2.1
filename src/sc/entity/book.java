package sc.entity;

import java.util.Date;

public class book {
    private int book_id;
    private String book_name;
    private String book_author;
    private String book_concern;
    private Date concern_time;
    private int state;
    private String lender;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_concern() {
        return book_concern;
    }

    public void setBook_concern(String book_concern) {
        this.book_concern = book_concern;
    }

    public Date getConcern_time() {
        return concern_time;
    }

    public void setConcern_time(Date concern_time) {
        this.concern_time = concern_time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    @Override
    public String toString() {
        return "book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_author='" + book_author + '\'' +
                ", book_concern='" + book_concern + '\'' +
                ", concern_time=" + concern_time +
                ", state=" + state +
                ", lender='" + lender + '\'' +
                '}';
    }
}
