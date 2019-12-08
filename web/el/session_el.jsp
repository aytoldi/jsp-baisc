<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/7 0007
  Time: 上午 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>${sessionScope.student.name}</h2>
    <h2>${sessionScope.student.mobole}</h2>
    <h2>${sessionScope.grade}</h2>
    <!--获取url中的teacher参数   localhost:8080/selServerlet?teacher=male -->
    <h2>${param.teacher}</h2>
</body>
</html>
