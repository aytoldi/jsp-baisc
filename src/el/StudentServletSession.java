package el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "StudentServletSession")
public class StudentServletSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student stu = new Student();
        //ئۇقۇغۇچى class دىكى مىقدارلارنى دەسپلەلەشتۈرۈش
        stu.setName("session-java");
        stu.setMobile(null);
        /*
           ئا : servlet دىن jsp بەتكە request شەكلىدە بېرىپ ، مۇشۇ StudentServlet دىكى ئۇچۇرنى jsp بەتكە چىقارماقچى  .
            شوڭا قىممەتنى request قا ساقلايمەن .
         * */
        HttpSession session = request.getSession();
        session.setAttribute("student",stu);
        String grade="sessionA";
        session.setAttribute("grade",grade);
        //بەت ئاتلاش
        request.getRequestDispatcher("/info.jsp").forward(request,response);
    }
}
