import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Admin on 27-06-2017.
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String breed=servletContextEvent.getServletContext().getInitParameter("breed");
        Dog dog=new Dog(breed);
        servletContextEvent.getServletContext().setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
