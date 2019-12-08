package el;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student stu = new Student();
        //ئۇقۇغۇچى class دىكى مىقدارلارنى دەسپلەلەشتۈرۈش
        stu.setName("java");
        stu.setMobile(null);
        /*
           ئا : servlet دىن jsp بەتكە request شەكلىدە بېرىپ ، مۇشۇ StudentServlet دىكى ئۇچۇرنى jsp بەتكە چىقارماقچى  .
            شوڭا قىممەتنى request قا ساقلايمەن .
         * */
        request.setAttribute("student",stu);
        String grade="A";
        response.getWriter().append("AAA");

        request.setAttribute("grade",grade);
        //بەت ئاتلاش
        request.getRequestDispatcher("/info.jsp").forward(request,response);
    }
}
