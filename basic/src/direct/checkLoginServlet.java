package direct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *servlet ئەزانىڭ ئىسم ۋە پارول ئوخشاشمۇ ئەمەس شۇنى سېلىشتۇرۇرپ چىقدىغان 
 * */

@WebServlet("/direct/check")
public class checkLoginServlet extends HttpServlet {
       
    public checkLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用户登录成功");
		/*
		 * 实现了请求转发的功能
		 *نى باشقا بەتكە باشلاش request تىزىملىتىش مۇۋەپىقيەتلىك بولغاندىن كىيىن ، باشقا بەتكە ئاتلاش ، يەنى
		 * */
		// request.getRequestDispatcher("/direct/index").forward(request, response);
		
		//响应重定向，需要增加contextPath
		response.sendRedirect("/direct/index");
	}

}
