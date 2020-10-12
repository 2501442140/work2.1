CREATE DATABASE library CHARACTER SET utf8;

USE library;
DROP TABLE book;
CREATE TABLE book
(

	book_id  INT(10) AUTO_INCREMENT PRIMARY KEY COMMENT'ID',
	book_name VARCHAR(30) NOT NULL COMMENT'书名',
	book_author VARCHAR(30) NOT NULL COMMENT'作者',
	book_concern VARCHAR(50) NOT NULL COMMENT'出版社',
	concern_time DATETIME NOT NULL COMMENT'出版时间',
	state INT(1) NOT NULL COMMENT'借阅状态',
	lender VARCHAR(30)  COMMENT'借阅人'
)

INSERT INTO book(book_name,book_author,book_concern,concern_time,state,lender)
VALUE('java','叶丁丁','武纺外经贸','2019-01-02',0,'null');
INSERT INTO book(book_name,book_author,book_concern,concern_time,state,lender)
VALUE('python','小邓','2a711','2019-01-07',0,'null');
INSERT INTO book(book_name,book_author,book_concern,concern_time,state,lender)
VALUE('c++','吴奥杰','2a721','2019-07-02',0,'null');
INSERT INTO book(book_name,book_author,book_concern,concern_time,state,lender)
VALUE('php','吴杰','2a721','2019-08-02',0,'null');
