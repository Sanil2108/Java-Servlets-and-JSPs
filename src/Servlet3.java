import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Admin on 27-06-2017.
 */
@WebServlet(name = "Servlet3", urlPatterns = {"/Servlet3"}, initParams = {@WebInitParam(name="name", value="Sanil")})
public class Servlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext=getServletContext();
        PrintWriter writer=response.getWriter();
        HttpSession session=request.getSession();

        String newName=request.getParameter("name");

        if(newName!=null && newName!="") {
            servletContext.setAttribute("name", newName);
            session.setAttribute("name", newName);
        }

        writer.write("name in servlet request : "+request.getParameter("name"));
        writer.write("\nname in servlet session : "+session.getAttribute("name"));
        writer.write("\nname in servlet context : "+servletContext.getAttribute("name"));

        writer.write("\n\nInit params "+getInitParameter("name"));
    }
}
