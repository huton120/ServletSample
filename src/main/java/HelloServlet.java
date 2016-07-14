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
        
        //HttpServletRequest reqの中身を見るためにコードを記載
        out.println("req.getRequestURL:" +  req.getRequestURL() +  "<br>");
        out.println("req.getMethod:" +  req.getMethod() +  "<br>");
        
        //HttpServletResponse　resの中身を見るためにコードを記載
        out.println("res.getContentType:" + res.getContentType() + "<br>");
       
        out.println("</body></html>");
        
        //リダイレクトを行いたいときの処理 使いたい場合はコメントを外すこと
        //res.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
        //res.setHeader("Location", "http://localhost:8080/hello/");
        
       
    }
}