import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
                                                   throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        //html�Ƃ��ĕ\��
        out.println("<html><body>");
        
        //��������u���E�U�ɏo��
        out.println("Hello (HelloServlet.java) <br>");
        
        //HttpServletRequest req�̒��g�����邽�߂ɃR�[�h���L��
        out.println("req.getRequestURL:" +  req.getRequestURL() +  "<br>");
        out.println("req.getMethod:" +  req.getMethod() +  "<br>");
        
        //HttpServletResponse�@res�̒��g�����邽�߂ɃR�[�h���L��
        out.println("res.getContentType:" + res.getContentType() + "<br>");
       
        out.println("</body></html>");
        
        //���_�C���N�g���s�������Ƃ��̏��� �g�������ꍇ�̓R�����g���O������
        //res.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
        //res.setHeader("Location", "http://localhost:8080/hello/");
        
       
    }
}