import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SurveyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
                                                   throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        //htmlとして表示
        out.println("<html><body>");
        
        //HttpServletRequest reqの中身を見るためにコードを記載
        out.println("req.getRequestURL:" +  req.getRequestURL() +  "<br>");
        out.println("req.getMethod:" +  req.getMethod() +  "<br>");
        
        //HttpServletResponse　resの中身を見るためにコードを記載
        out.println("res.getContentType:" + res.getContentType() + "<br>");
       
        out.println("</body></html>");

    }
}