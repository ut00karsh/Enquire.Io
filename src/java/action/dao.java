
package action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import tables.Answer_Details;
import tables.query_details;
import tables.user_details;

public class dao 
{
    
      private static SessionFactory sessionFactory;
    static {
         Configuration cfg = new Configuration();
         cfg.addAnnotatedClass(user_details.class);
         cfg.addAnnotatedClass(query_details.class);
         cfg.addAnnotatedClass(Answer_Details.class);
         
          
         cfg.configure();
         sessionFactory = cfg.buildSessionFactory();
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
    

