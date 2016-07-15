import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedirectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
                                                   throws IOException, ServletException {
        res.setContentType("text/html");

        /*リダイレクトを行う
         *下記のURLは存在しないページを表す。
         *参考 Webコンポーネントディベロッパ p49
         */
        res.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
        res.setHeader("Location", "http://localhost:8080/hello/redirect/redirect.html");
       
    }
}