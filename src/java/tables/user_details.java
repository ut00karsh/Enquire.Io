
package tables;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class user_details 
{
    @Id
    private String user_id;
    private String user_name;
      private String password;
    private String mail_id;
    private String qualification; 
    

    public user_details(String user_id, String user_name, String password, String mail_id, String qualification) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.mail_id = mail_id;
        this.qualification = qualification;
    }

    public user_details() 
    {
        
    }
  

   
    public String getUser_id() {
        return user_id;
    }

   
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    
    public String getUser_name() {
        return user_name;
    }

   
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

  
    public String getMail_id() {
        return mail_id;
    }

  
    
    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    
    
    public String getQualification() {
        return qualification;
    }

   
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    
    
}
