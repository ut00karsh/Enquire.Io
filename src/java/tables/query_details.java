
package tables;
import java.io.*;
import com.mysql.jdbc.Blob;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.sql.*;




@Entity
public class query_details 
{

   
    @Id
    @GeneratedValue
    private int Query_id;
    private String user_id;

   
    private String status;
    private String query_string;


    private String role;
    private String technology;
    private String q_description;
    private String q_type;
 
    private int vote_count;
    
   
  

  

    public query_details(int Query_id, String user_id, String status, String query_string, String role, String technology, String q_description, String q_type,int vote_count ) {
        this.Query_id = Query_id;
        this.user_id = user_id;
        this.status = status;
        this.query_string = query_string;
        this.role = role;
        this.technology = technology;
        this.q_description = q_description;
        this.q_type = q_type;
       
        this.vote_count=vote_count;
        
      
    }
    
     public query_details() {
    }
  


    public int getQuery_id() {
        return Query_id;
    }

   
    public void setQuery_id(int Query_id) {
        this.Query_id = Query_id;
    }

  
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuery_string() {
        return query_string;
    }

    
    public void setQuery_string(String query_string) {
        this.query_string = query_string;
    }

    public String getRole() {
        return role;
    }

  
    public void setRole(String role) {
        this.role = role;
    }

    
    public String getTechnology() {
        return technology;
    }

    
    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getQ_description() {
        return q_description;
    }

    public void setQ_description(String q_description) {
        this.q_description = q_description;
    }

    public String getQ_type() {
        return q_type;
    }

    public void setQ_type(String q_type) {
        this.q_type = q_type;
    }

  

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }


    

    

   
            
    
    
}
