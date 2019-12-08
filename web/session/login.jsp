<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/3 0003
  Time: 下午 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/LoginServlet" method="post">
    <div class="formItem">
        <label for="">name:</label>
        <input type="text" name="userName">
    </div>
    <div class="formItem">
        <label for="">password:</label>
        <input type="text" name="password">
    </div>
    <div class="formItem">
        <input type="submit" value="submit">
    </div>
</form>
</body>
</html>
