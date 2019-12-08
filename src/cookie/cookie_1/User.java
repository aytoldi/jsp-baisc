package cookie.cookie_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ئا : cookie بولسا تور كۆرگۈچ ئۆز يەرلىكىدە ساقلايدىغان قىسقا تېكىسىت شەكلىدىكى قىسقا مەزمۇن
 * ب : تور كۆرگۈچ www.imooc.com نى زىيارەت  قىلغاندا ئەزانىڭ ئۇچۇرلىرنى ساقلايدۇ
 *    تور كۆرگۈچ ئىتىلىپ قايتا ئاچقاندىمۇ ئەزانىڭ ھالىتى يەنىلا نورمال تىزىملىتىلغان ھالەت بولغاندا ، ئەزانىڭ ئۇچۇرى ئۆچمىدى 
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public User() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Cookie newCookie = new Cookie("user","admin");
		 //ھاياتلىق دەۋرى قانچە كۈن
		 newCookie.setMaxAge(60*60*24*7*2);
		 //ئەزاغا cookie قايتۇرۇش
		 response.addCookie(newCookie);
		response.getWriter().append("Served at: ").append("login succss");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
