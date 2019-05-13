
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class WebListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.michael_Seminary_Work_war_1.0-SNAPSHOTPU");
        sce.getServletContext().setAttribute("emf", emf);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        EntityManagerFactory emf =
            (EntityManagerFactory)sce.getServletContext().getAttribute("emf");
        emf.close();
    }
}
