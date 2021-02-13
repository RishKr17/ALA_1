/*Class to model the entity Person
  Author: Rishabh Kumar
  IDE: VS Code
  Date: 02/12/2021
*/
public class Person{
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(){
        this.name = "none";
        this.address = "none";
        this.phone = "none";
        this.email = "none";
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public String toString(){
        return "Name: "+ this.name + "\nAddress: "+ this.address + "\nPhone: "+ this.phone +"\nEmail: "+ this.email;

    }
}