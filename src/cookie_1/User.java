package cookie_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * بولسا تور كۆرگۈچ ئۆز يەرلىكىدە ساقلايدىغان قىسقا تېكىسىت شەكلىدىكى قىسقا مەزمۇن cookie
 * ئوبىكتى قۇرسۇن ، ئاندىن بۇنىڭغا ئەزانىڭ ئۇچۇرلىرنى ساقلىسۇن ، تور كۆرگۈچ ھەرقېتىم ئۇچۇر يوللىغاندا بۇ ئۇچۇرنى قۇشۇپ يوللايدۇ cookie ئادىرىسقا ئۇچۇر ئەۋەتكەندە مۇلازىمتىر  /User  تور كۆرگۈچ 
 * 
 * نى زىتارەت قىلغاندا ئەزانىڭ ئۇچۇرلىرنى ساقاللاۇيدۇ  www.imooc.com  تور كۆرگۈچ 
 *    تور كۆرگۈچ ئىتىلىپ قايتا ئاچقاندىمۇ ئەزانىڭ ھالىتى يەنىلا نورمال تىزىملىتىلغان ھالەت بولغاندا ، ئەزانىڭ ئۇچۇرى ئۆچمىدى 
 *    把当前登陆用户的信息每一次浏览器访问imoo.com的时候它把cookie中的信息提取出来并且通知服务器之间这个用户已经登陆过了
 * 
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//قۇرىدۇ new Cookie ئەۋەتكەندە مۇلازىمتىز ئۆزىدە  request ئەزامۇلازىمتىرغا   
		 Cookie newCookie = new Cookie("user","admin");
		 //ھاياتلىق دەۋرى قانچە كۈن
		 newCookie.setMaxAge(60*60*24*7*2);
		 //نىمۇ قۇشۇپ ئەۋەتىدۇ cookie يوللىغاندا response مۇلازىمتىر توركۆرگۈچكە 
		 response.addCookie(newCookie);
		 
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append("login succss");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
