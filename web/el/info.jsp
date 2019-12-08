<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/7 0007
  Time: 上午 0:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--获取从servlet转发过来的数据-->
    <h2>${requestScope.student.name}</h2>
    <h2>${requestScope.student.mobile}</h2>
    <h2>${requestScope.grade}</h2>

</body>
</html>
