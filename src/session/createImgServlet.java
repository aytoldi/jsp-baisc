package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "createImgServlet")
public class createImgServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width=100;
        int height=100;
        //创建一个图片
        BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //رەسىمگە خەت يېزىش ئۈچۈن مەن ئاۋال قەلەم گە ئېرىشىشم كېرەك
        Graphics g = img.getGraphics();
        g.setColor(Color.pink);//رەڭگى
        g.fillRect(0,0,width,height);// رەڭ تولدۇرۇش ، يەنى تولدۇردىغان كوئوردىناتنى تەڭشىگلى بولىدۇ ، يەنى panel نىڭ background نى تەڭشەش
        g.setColor(Color.BLUE);
        g.drawRect(0,0,width-1,height-1);// قىر ھاسىل قىلىش

        String str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        StringBuilder text = new StringBuilder();
        for(int i=0;i<4;i++){
            int index=rand.nextInt(str.length());// ھەر بىر قېتىم ئوخشىمغان سان ھاسىل قىلدۇ ، يەنى 0 دىن lengthغىچى
            char ch = str.charAt(index);// خالىغان سانغا ئاساسەن ماس ئۇرۇندىكى ھەرىپكە ئېرىىشىش
            text.append(ch);
            g.drawString(ch+"",width/5*i,height/2);
        }
        String checkCode=text.toString();
        request.getSession().setAttribute("checkCode",checkCode);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
