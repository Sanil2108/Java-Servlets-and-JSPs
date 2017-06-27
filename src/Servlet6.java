import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Admin on 27-06-2017.
 */
@WebServlet(name = "Servlet6", urlPatterns = {"/Servlet6"})
public class Servlet6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies=request.getCookies();
        PrintWriter writer=response.getWriter();
        boolean cookieFound = false;
        try {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("name")) {
                    cookieFound = true;
                    writer.write("Hello, " + cookie.getValue());
                    break;
                }
            }
        }catch (NullPointerException e){
            writer.write("No cookies ???");
        }

        if(!cookieFound) {
            String name = request.getParameter("name");
            if(name!=null && name!="") {
                Cookie cookie = new Cookie("name", name);
                cookie.setMaxAge(1000000000);
                writer.write("You must be new around here ...");
                response.addCookie(cookie);
            }
        }
    }
}
