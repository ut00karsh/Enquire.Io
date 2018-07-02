
package tables;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vote_count 
{
  @Id
    private int query_id;
    private String user_id;

  
  public Vote_count()
    {
        
    }
    
    
    public Vote_count(int query_id, String user_id) {
        this.query_id = query_id;
        this.user_id = user_id;
    }
  

  
    public int getQuery_id() {
        return query_id;
    }

    
    public void setQuery_id(int query_id) {
        this.query_id = query_id;
    }

   
    public String getUser_id() {
        return user_id;
    }

    
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
}
