import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Admin on 27-06-2017.
 */
@WebServlet(name = "Servlet5", urlPatterns = {"/Servlet5"})
public class Servlet5 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newName = request.getParameter("name");
        if(newName != null && newName!= ""){
            request.getSession().setAttribute("name", newName);
            getServletContext().setAttribute("name", newName);
        }
        PrintWriter writer=response.getWriter();
        writer.write(String.format("Value in request:%s\nValue in session:%s\nValue in context:%s",
                request.getParameter("name"),
                request.getSession().getAttribute("name"),
                getServletContext().getAttribute("name")));

        request.getSession().setMaxInactiveInterval(20);
    }
}
