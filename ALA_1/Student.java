/*Class to model the entity Student
  Author: Rishabh Kumar
  IDE: VS Code
  Date: 02/12/2021
*/
public class Student extends Person {
    private String id;
    private String major;
    private String gpa;
    
    public Student(){
        this.id = "none";
        this.major = "none";
        this.gpa = "none";    
    }

    public Student(String id, String major, String gpa){
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    public Student(String name, String address, String phone, String email, String id, String major, String gpa){
        super(name, address, phone, email);
        this.id = id;
        this.major = major;
        this.gpa = gpa;        
    }

    public String getId(){
        return id;
    }

    public String getMajor(){
        return major;
    }

    public String getGpa(){
        return gpa;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setMajor(String major){
        this.major = major;
    }   
    
    public void setGpa(String gpa){
        this.gpa = gpa;
    }  
      
    @Override
    public String toString(){
        return super.toString() + "\nID: " + id + "\nMajor: " + major + "\nGPA: " + gpa;
    }
}
