package cookie_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getCookie
 *بارمۇ يوق شۇنى تەكشۈرىدۇ cookie ئەۋەتكەندە request ئەزا تور كۆرگۈچتىن مۇلازىمتىردىكى بۇ ئادىرىسقا 
 *نى ئەۋەت دەپ قىلدىم cookie قا توركۆرگۈچ ئۆزىدىكى request يەنى مەن تور كۆرگۈچكە  مۇلازىمتىرغا ئۇچۇر ئەۋەتكەندە 
 */
@WebServlet("/getCookie")
public class getCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//غا ئېرىشىش cookie ئەزا توركۆرگۈچتىن مۇلازىمتىرغا ئەۋەتكەن 
		Cookie[] getCookieObject = request.getCookies();
		Cookie obj=null;
		if(getCookieObject.length>0){
			for(Cookie item:getCookieObject){
				if(item.getName().equals("admin")){
					obj=item;
					break;
				}
			}
		}
		if(obj==null){
			//قىلىپ بەرسۇن مەزمۇننى append غا  getWriter() ئوبىكتنىڭ ئىچدىكى  response
			response.getWriter().append("login not ");
			return;
		}
		if(obj!=null){
			response.getWriter().append("name:"+obj.getName()+"\t"+"val:"+obj.getValue());
		}
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
