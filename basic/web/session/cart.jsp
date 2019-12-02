<%@ page import="java.util.Map" %>
<%@ page import="java.util.Entry" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/30 0030
  Time: 上午 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--ئەمدى session نىڭ ئىچىدىن map ساقلىغان مەھسۇلاتنى list.jsp دە ئۇقۇپ چىقىمىز-->
    <%
        Map<String,Integer> map = (Map<String,Integer>)request.getSession().getAttribute("cart");
    %>
<table>
    <tr>
        <th>mall Name</th>
        <th>count</th>
    </tr>
<%--         ئەگەر مال ھارۋىسدا مەل قۇرۇق بولسا--%>
    <% if(map==null){ %>
    <tr>
        <td>mall yok</td>
    </tr>
    <%
        }else{
        for (Entry<String,Integer> en : map.keySet()){
    %>
    <tr>
        <td><%=en.getKey()%></td>
        <td><%=en.getValue()%></td>
    </tr>
    <%
        }
     }
    %>





</table>
</body>
</html>