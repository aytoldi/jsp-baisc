package ContentType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletContentType")
public class ServletContentType extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletContentType() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String output="<h1><a href='javascript:;'>hello world</a></h1>";
        //contentType决定浏览器采用何种方式对响应体进行处理;
        response.setContentType("text/plain;charset=utf-8");
        /*
         * Content-Type: text/plain;charset=utf-8
         * 响应的部分中返回的contentType是text/plain;浏览器收到了这个响应;浏览器上展示纯文本形式；浏览器不会任何处理
         * response 对象中调用getWriter() 方法
         * */
        response.getWriter().append(output);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
