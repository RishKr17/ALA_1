/*Program test file
  Author: Rishabh Kumar
  IDE: VS Code
  Date: 02/12/2021
*/
public class Test {
    public static void main(String[] args){
        Person[] p = new Person[4];
        //Initializing each object in the array
        p[0] = new Person("Helen Brown", "222 10th Street, Bethlehem", "(610)334-2288", "hbrown@gmail.com");
        p[1] = new Student("Gary Leister", "972 4th Street, Emmaus", "(202)331-7177", "gleister@gmail.com", "12345", "CSE", "3.50");
        p[2] = new Employee("Beth Down", "234 Main Street, Philadelphia", "(610)222-4433", "bdown@gmail.com", "33442", "Systems Administrator", "75000.00");
        p[3] = new Faculty("Mark Jones", "21 Orchid Street, Bethlehem", "(610)333-2211", "mjones@gmail.com", "22222", "Faculty", "90000.00", "Professor");
        selectionSort(p);
        printArray(p);
    }

    //defining method for printing out the array elements
    public static void printArray(Person[] p){
        for(int i=0; i<p.length; i++){
            System.out.println(p[i].toString());
        }
    }

    //Sorting the persons in alphabetical order using selection sort
    public static void selectionSort(Person[] p){
        for(int i=0; i< p.length-1; i++){
            int min=i;
            for(int j=i+1; j<p.length; j++){
                if(p[i].getName().compareTo(p[j].getName())>0)
                    min=j;
            }
            Person temp= p[min];
            p[min] = p[i];
            p[i] = temp; 
        }
    }
}
