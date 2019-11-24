package cookie_2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *使用cookie浏览历史
 * نى ئىشلىتىپ  توركۆرگۈچنىڭ زىيارەت تارىخنى خاتىرلەڭ cookie
            ئەۋەتكەندە  request شەكلىدە get ئوخشاش بولمىغان ئادىرىس ئارقىلىق مۇلازىمترىغا  
 */
public class LinkList extends HttpServlet {
    public LinkList() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得浏览器当前要访问品牌
		String paramName=request.getParameter("name");
		//获取requst中的cookie信息
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
		//如果有cookie，用户已经访问过了
		if(cookie!=null){
			//之前记录的品牌
			String cookieValue=cookie.getValue();
			//如果string中的字符包含paramName，不用添加新的品牌, history = dell,apple,...
			if(cookieValue.contains(paramName)){
				cookie=new Cookie("history", cookieValue);
			}else{
				//没有记录，添加新的品牌
				cookie=new Cookie("history", cookieValue+","+paramName);
			}
		}else{
			//cookie 没有获得，第一次访问
			cookie = new Cookie("history", paramName);
		}
		// TODO Auto-generated method stub
		response.addCookie(cookie);
		//redirect
		response.sendRedirect("/Demo2/cookie/cookie_2.jsp");
	}

}
