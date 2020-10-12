<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/12
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/no1.js"></script>
<body>
<table border="1px" width="400px" align="center">
    <tr>
        <td align="center" colspan="4"><h2>图书信息</h2></td>
    </tr>
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>出版社</td>
        <td>操作</td>
    </tr>
    <c:forEach var="us" items="${list}">
        <tr>
            <td>${us.book_name}</td>
            <td>${us.book_author}</td>
            <td>${us.book_concern}</td>
            <td><a href="bookServlet?book_id=${us.book_id}&comm=up">借阅</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
