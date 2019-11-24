<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/Demo2/LinkList?name=apple">apple</a>
	<a href="/Demo2/LinkList?name=asus">asus</a>
	<a href="/Demo2/LinkList?name=dell">dell</a>
	<a href="/Demo2/LinkList?name=sony">sony</a>
	<h2>你浏览过：</h2>
	<%
	Cookie[] getCookieObject = request.getCookies();
	Cookie cookie=null;
	if(getCookieObject.length>0){
		for(Cookie item:getCookieObject){
			if(item.getName().equals("history")){
				cookie=item;
				break;
			}
		}
	}
	if(cookie==null){
		out.println("no page");
	}else{
		out.print(cookie.getValue());
	}
	%>
</body>
</html>