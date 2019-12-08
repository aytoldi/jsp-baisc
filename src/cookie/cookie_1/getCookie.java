package cookie.cookie_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getCookie")
public class getCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public getCookie() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//     بىرنىچى قەدەم cookie غا ئېرىشىش
		Cookie[] getCookieObject = request.getCookies();
		// ئا: ئىچكى ساقلىغۇچقا بىر تال مەۋھۇم مىقداردىن بىرنى ساقلىۋالدىم
		Cookie obj=null;
		// ب : cookie نىڭ dataType بولسا Array شوڭا length دەپ ئالمەن
		if(getCookieObject.length>0){
			// س: cookie دىكى ئۇچۇرلارنى ئۇقۇپ چىقىش
			for(Cookie item:getCookieObject){
				 // د: ئەگەر getName نىڭ قىممىتى admin غا تەڭ بولسا
				if(item.getName().equals("admin")){
					// ئې : مەۋھۇم مىقدارغا قىممەتنى ساقلايمەن
					obj=item;
					break;
				}
			}
		}
		// مەۋھۇم مىقدار قۇرۇق بوپ قالسا
		if(obj==null){
			response.getWriter().append("login not ");
			return;
		}
		// قۇررۇق بولمىسا cookie نىڭ ئىچدىكى ئۇچۇرلار مەۋھۇم مىقداردا ساقلاقلىق بولىدۇ
		if(obj!=null){
			response.getWriter().append("name:"+obj.getName()+"\t"+"val:"+obj.getValue());
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
