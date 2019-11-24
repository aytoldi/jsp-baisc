package srevlet.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ئەۋەتىدىغان ئادىرىس request
@WebServlet("/firsetServlet") 
public class firsetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public firsetServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  	//پارامتىرغا ئېرىشىش request ئەزا مۇلازىمتىرغا ئۇچۇر قىلىپ يوللىغان 
    	String name=request.getParameter("name");
    	String mobile=request.getParameter("mobile");
    	String sex=request.getParameter("sex");
    	//بىردىن ئارتۇق پارامتىرغا ئېرىشىش
    	String[] spec=request.getParameterValues("spec");
    	//Object ئۇسۇلنى ئىشلتىش ، بۇئۇسۇلنىڭ قايتىلما قىممىتى بولسا  getWriter نىڭ ئىچىدىن class دىگەن response
    	PrintWriter out = response.getWriter();
    	out.println("<h1>name:"+name+"</h1>");
    	out.println("<h1>mobile:"+mobile+"</h1>");
    	out.println("<h1>sex:"+sex+"</h1>");
    	for(int i=0;i<spec.length;i++){
    		out.println("<h1>spec:"+spec[i]+"</h1>");
    	}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void destory(){
		
	}
}
