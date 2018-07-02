
package tables;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class expert_details 
{
      @Id
    private String expert_id;
    private String expert_name;
      private String password;
    private String mail_id;
    private String specialization; 
    private String role;

    
    public String getExpert_id() {
        return expert_id;
    }

   
    public void setExpert_id(String expert_id) {
        this.expert_id = expert_id;
    }

   
    public String getExpert_name() {
        return expert_name;
    }

    
    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
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

   
    public String getSpecialization() {
        return specialization;
    }

   
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
}
