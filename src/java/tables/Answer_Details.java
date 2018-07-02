
package tables;

import com.mysql.jdbc.Blob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.*;
@Entity
public class Answer_Details 
{
    @Id
   @GeneratedValue
private int Answer_id;  
private int Query_id;
private String User_id;
private String Answer_String;
private String Role;

private String A_type;

    public Answer_Details(int Answer_id, int Query_id, String User_id, String Answer_String, String Role,  String A_type) {
        this.Answer_id = Answer_id;
        this.Query_id = Query_id;
        this.User_id = User_id;
        this.Answer_String = Answer_String;
        this.Role = Role;
      
        this.A_type = A_type;
    }


      
     
     
     public Answer_Details() 
       {
           
           
        }

    
    public int getAnswer_id() {
        return Answer_id;
    }

   
    public void setAnswer_id(int Answer_id) {
        this.Answer_id = Answer_id;
    }

   
    public int getQuery_id() {
        return Query_id;
    }

    public void setQuery_id(int Query_id) {
        this.Query_id = Query_id;
    }

    public String getUser_id() {
        return User_id;
    }

  
    public void setUser_id(String User_id) {
        this.User_id = User_id;
    }

 

    public String getA_type() {
        return A_type;
    }

    public void setA_type(String A_type) {
        this.A_type = A_type;
    }

    
    public String getAnswer_String() {
        return Answer_String;
    }

  
    public void setAnswer_String(String Answer_String) {
        this.Answer_String = Answer_String;
    }

   
    public String getRole() {
        return Role;
    }

   
    public void setRole(String Role) {
        this.Role = Role;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
