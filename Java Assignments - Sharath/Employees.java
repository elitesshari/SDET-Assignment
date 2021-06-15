import java.util.ArrayList;
import java.io.*;

 

public class Employees {
int id;
String name;
long salary;
static ArrayList al = new ArrayList();
static int count = 0; //to track the no. of Employeess

 

Employees()
{
}

 

//constructor for initializing Employees objects

 

Employees(int id, String name, long salary)
{
this.id = id;
this.name = name;
this.salary = salary;
count++;
}

 

//method to store Employeess details in an arraylist

 

public void putDetails(Employees e)
{
al.add(e);
}

 

//method to retreive Employees objects

 

public Employees getDetails(int id)
{
Employees es = (Employees)al.get(id);
return es;
}

 


public static void main(String[] args) throws IOException
{

 

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 

Employees e = new Employees();
Employees e1 = new Employees(1, "kumar", 15000);
Employees e2 = new Employees(2, "satish", 20000);
Employees e3 = new Employees(3, "anuo", 21000);
Employees e4 = new Employees(4, "dawan", 18000);
Employees e5 = new Employees(5, "krishna", 16000);
Employees e6 = new Employees(6, "rajendra", 30000);

 


e.putDetails(e1);
e.putDetails(e2);
e.putDetails(e3);
e.putDetails(e4);
e.putDetails(e5);
e.putDetails(e6);

 

System.out.println("The total number of Employeess are: " +count);
System.out.println(" ");

 

while(true)
{
System.out.println("Enter Employeese id to get the Employees Information: ");
int id = Integer.parseInt(br.readLine());
boolean flag = false;

 

for(int i=0; i<count;i++) {
Employees es = e1.getDetails(i);
if(id == es.id)
{
System.out.println("The Information of the Employeese with id " +id +" is: ");
System.out.print(es.id +" " +es.name+" " +es.salary);
flag = true;
break;
}
}

 

System.out.println(" ");

 

if(!flag)
{
System.out.println("Sorry, no Info found with the entered id " +id);
}
System.out.println(" ");
String ch = null;

 

while(true)
{
System.out.println("Do you Want to Continue(y/n)?)");
System.out.println(" ");
ch = br.readLine();
if(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")) break;
if(!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")))
{
System.out.println("Invalid option : please type y/n");
System.out.println(" ");
}
}

 

if(ch.equalsIgnoreCase("n"))
{
System.out.println(" ");
System.out.println("Thank you");
break;
}
}
}
}