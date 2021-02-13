/*Class to model the entity Faculty
  Author: Rishabh Kumar
  IDE: VS Code
  Date: 02/12/2021
*/
public class Faculty extends Employee {
    private String rank;

    public Faculty(){
        this.rank = "none";
    }

    public Faculty(String rank){
        this.rank = rank;
    }

    public Faculty(String name, String address, String phone, String email, String id, String title, String annSalary, String rank){
        super(name, address, phone, email, id , title, annSalary);
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRank: " + rank;
    }    
}
