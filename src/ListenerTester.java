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
@WebServlet(name = "ListenerTester")
public class ListenerTester extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dog dog=(Dog)getServletContext().getAttribute("dog");
        PrintWriter printWriter=response.getWriter();
        printWriter.write(dog.getBreed());
    }
}
