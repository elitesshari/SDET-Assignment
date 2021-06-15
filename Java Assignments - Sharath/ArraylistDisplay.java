//DisplayArrayList.java
 
package com.ArraylistDisplay;
 
import java.util.*;
 
class Employeeinfo{
    public int id;
    public String name;
    public int salary;
    public static int count = 0;
 
    //zero argument constructor. Gets called by default when an object is created for the Employee class
    public Employeeinfo(){}
 
    //Parameterized Constructor
    public Employeeinfo(int id, String name,int salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.salary=salary;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public int getSalary() {
    return salary;
    }
}
 
public class DisplayArrayList {
public static void main(String[] args) throws Exception 
    {
     List<Employeeinfo> list = new ArrayList<Employeeinfo>();
 
     list.add(new Employeeinfo(1, "Satish",5000));
     list.add(new Employeeinfo(2, "Suresh",10000));
     list.add(new Employeeinfo(3, "Kumar",15000));
     list.add(new Employeeinfo(4, "Vinod",20000));
 
        for (Employeeinfo s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, Name and Salary of the employee are : ");
            System.out.println(s.getId()+" "+s.getName()+" " +s.getSalary());
        }
    }//End of main() method
}//end of DisplayArrayList class