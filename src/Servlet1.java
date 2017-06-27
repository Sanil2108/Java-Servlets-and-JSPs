import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Admin on 24-06-2017.
 */
@WebServlet(name = "Servlet1",urlPatterns = {
        "/Servlet1"
})
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter=response.getWriter();
        response.setContentType("text/html");
//        printWriter.write(BookRecommender.getBook(request.getParameter("name")));

        request.setAttribute("result", BookRecommender.getBook(request.getParameter("name")));
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("jsp1.jsp");
        requestDispatcher.forward(request, response);
    }
}