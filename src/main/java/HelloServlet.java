import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
                                                   throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>Hello HelloServlet.java‚Å‘‚¢‚½html‚Ì’†g‚ª•\¦‚³‚ê‚Ä‚é‚æ!</body></html>");
    }
}