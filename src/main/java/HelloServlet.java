import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
                                                   throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        //htmlとして表示
        out.println("<html><body>");
        
        //文字列をブラウザに出力
        out.println("Hello (HelloServlet.java) <br>");
        
        out.println("</body></html>");
        
    }
}