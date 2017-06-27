import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Admin on 24-06-2017.
 */
@WebServlet(name = "Servlet2",urlPatterns = {
        "/Servlet2"
})
public class Servlet2 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("image/jpg");
//        OutputStream out=resp.getOutputStream();
//        FileInputStream fileInputStream=new FileInputStream("img.jpg");
//        int c;
//        while((c=fileInputStream.read()) != -1){
//            out.write(c);
//        }
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.write(getServletConfig().getInitParameter("adminName"));
    }

}
