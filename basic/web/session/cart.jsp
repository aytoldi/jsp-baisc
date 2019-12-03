<%@ page import="java.util.Map" %>

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
        for (Map.Entry<String,Integer> en : map.entrySet()){
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