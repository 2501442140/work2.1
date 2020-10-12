<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/12
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    function aa() {
        history.back();
    }
</script>
<body>
<form action="bookServlet" method="post">
    <table align="center">
        <input type="hidden" name="book_id" value="${bo.book_id}">
        <tr>
            <td colspan="2"><h1>图书简要介绍</h1></td>
        </tr>
        <tr>
            <td>书名:</td>
            <td>${bo.book_name}</td>
        </tr>
        <tr>
            <td>作者：</td>
            <td>${bo.book_author}</td>
        </tr>
        <tr><td>出版社</td><td>${bo.book_concern}</td></tr>
        <tr><td>出版时间</td><td>${bo.concern_time}</td></tr>
        <tr><td>借阅人</td><td><input type="text" name="lender" value=""></td></tr>
        <tr><td><input type="submit" name="comm" value="借阅"></td>
            <td><input type="button" onclick="aa()" value="返回"></td></tr>
    </table>
</form>
</body>
</html>
