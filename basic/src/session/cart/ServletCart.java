package session.cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
/*
*
* HashMap 存储无序的
*
* */

public class ServletCart extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  ئەزا مال ھارۋسىغا قوشىمەن دىگەن كۇنۇپكا چىكىلگەندە ، مالنىڭ ئىسمنى ServletCart غا ئەۋەتىدۇ ،  مالنىڭ count قىممتىگە ئىرىشىش
        String name = request.getParameter("mall");
        //مەن count قىممەتكە ئاساسەن سانلار گوروپپىسدىكى مالغا ئىرىشمەكچى
        String[] goodsName = new String[]{"java","javascript","npl","python"};
        //ئالدى بەتتىن قوسشقان مەھسۇلاتقا ئىرىشىش ، ئىندېكىس قىممەتكە ئاساسەن مەھسۇلاتقا ئېرىشىش
        String index = goodsName[Integer.parseInt(name)];
        // ئەمدى session ئىچىدىن cart قىممەتكە ئىرىشەي
        HttpSession session = request.getSession();
        // چۈنكى مەن ئالدى بەتتە session.setAttribute غا new Map دەپ قىممەت بەرگەن، شوڭا تىپنى Map غا ئايلاندۇرىمەن
        Map<String,Integer> cartMaps = (Map<String, Integer>)session.getAttribute("cart");
        // ئەگەر مال ھارۋىغا قۇشۇش بىرىنچى قېتىم چىكلگەندە ، يەنى session دا ھىچقاندا قىممەت يوق ئەھۋال ، يەنى servlet نى بىرىنچى قېتىم زىيارەت قىلغان بولسا
        if(cartMaps==null){
            cartMaps = new LinkedHashMap<String,Integer>();
            cartMaps.put(name,1);
        }else{
            //ھازىر session دا قىممەت بار ، يەنى ئىلگىرى مال ھارۋىسغا مال قۇشۇش مەشغۇلاتى ئېلىپ بېرىلغان
            //ئەمدى session ساقلىغان map نىڭ ئىچىدىن قىممەتنى ئېلىپ ئۇقۇيمىز
            Integer count = cartMaps.get(name);
            if(count==null){
               //قىممەت قۇرۇق بولس, يەنى يېڭى مەھسۇلات قوشساا
                cartMaps.put(name,1);
            }else{
                // ،قىممەت بولسا , يەنى بۇ مەھسۇلات ئىلگىرى مال ھارۋىسغا قۇشۇلغان بولسا ، ھازىر مەن يەنە قايتا قوشتۇم
                cartMaps.put(name,++count);
            }
        }
        // ھەقىقى ھالدا session غا cart.jsp ئۇقۇيدىغانغا قىممەتنى ساقلايمىز
        request.getSession().setAttribute("cart",cartMaps);
        // قىممەت ساقلاپ بولغاندىن كىيىن مەھسۇلات تىزىملىكى بېتىگە ئاتلاش
        response.sendRedirect("basic/session/list.jsp");
    }
}
