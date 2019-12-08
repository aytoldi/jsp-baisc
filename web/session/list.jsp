<%--
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
<!--
    ھەرقېتىم count چىكىلگەندە ، چېكىلگەن قېتىم ساننىنى ۋە مالنىڭ نۇمۇرنى ئېلىپ.
    بۇنى مەن session ئارقىلىق مۇلازىمترىغا ئەۋەتىمەن .
    session.setAttribute("java",new HashMap(<String,Integer>));
-->
<table class="container" align="center" width="600px">
    <tr>
        <td class="item">
            <img src="http://img3.mukewang.com/szimg/5a7127370001a8fa05400300-360-202.jpg" alt="">
            <h4>java</h4>
            <a href="../cartSessionServlet?mall=1">1</a>
        </td>
        <td class="item">
            <img src="http://img3.mukewang.com/szimg/5db7fa4f09a2b64312000676-360-202.png" alt="">
            <h4>java</h4>
            <a href="../cartSessionServlet?mall=2">2</a>
        </td>
        <td class="item">
            <img src="http://img1.mukewang.com/szimg/5ddba9b909883e4112000676-360-202.png" alt="">
            <h4>java</h4>
            <a href="../cartSessionServlet?mall=3">3</a>
        </td>
        <td class="item">
            <img src="http://img2.mukewang.com/szimg/5dd35a9d0908d98a12000676-360-202.png" alt="">
            <h4>java</h4>
            <a href="../cartSessionServlet?mall=4">4</a>
        </td>
    </tr>
</table>
<div>
    <a href="cart.jsp">watch</a>
</div>
</body>
</html>
