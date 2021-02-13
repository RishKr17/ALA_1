/*Class to model the entity Employee
  Author: Rishabh Kumar
  IDE: VS Code
  Date: 02/12/2021
*/
public class Employee extends Person{
    private String id;
    private String title;
    private String annSalary;

    public Employee(){
        this.id = "none";
        this.title = "none";
        this.annSalary = "none";
    }

    public Employee(String id, String title, String annSalary){
        this.id = id;
        this.title = title;
        this.annSalary = annSalary;
    }

    public Employee(String name, String address, String phone, String email, String id, String title, String annSalary){
        super(name, address, phone, email);
        this.id = id;
        this.title = title;
        this.annSalary = annSalary;        
    }    

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAnnSalary(){
        return annSalary;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }   
    
    public void setAnnSalary(String annSalary){
        this.annSalary = annSalary;
    }  
       
    @Override
    public String toString(){
        return super.toString() + "\nID: " + id + "\nTitle: " + title + "\nAnnual Salary: $" + annSalary;
    }
}
