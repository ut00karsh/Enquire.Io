
package action;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import tables.Answer_Details;
import tables.expert_details;
import tables.query_details;
import tables.user_details;
import tables.Vote_count;
public class creator 
{
     public static void main(String[] args)throws Exception {
        Configuration cfg = new Configuration();
       /*cfg.addAnnotatedClass(user_details.class);
          cfg.addAnnotatedClass(Answer_Details.class);
          cfg.addAnnotatedClass(query_details.class);*/
           cfg.addAnnotatedClass(Vote_count.class);       
        
         cfg.configure();
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
        System.out.println("TABLE CREATED!!");
    
}
}
