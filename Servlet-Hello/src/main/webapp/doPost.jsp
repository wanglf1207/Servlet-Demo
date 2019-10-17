<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>do post test</title>
    <%
        request.setAttribute("favorite","play basketball");
    %>
</head>
<body>
    <form action="/Servlet-Hello/DoPost" method="post">
        <input type="text" name="username" />
        <input type="submit" /><!-- 注意,submit按钮自带提交功能-->
    </form>


</body>
</html>