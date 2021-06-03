import java.io.*;
import java.util.Scanner;
class person
{
String name;
String gender;
String address;
int age;
person()
 {
 name=" ";
 gender=" ";
 age=0;
 address=" ";
 }
 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("\n\nEnter person name");
 name=sc.nextLine();
 System.out.println("Enter gender");
 gender=sc.nextLine();
 System.out.println("Enter age");
 age=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("Name: "+name);
 System.out.println("gender:"+gender);
 System.out.println("Age:"+age);
 System.out.println("Address:"+address);
 }
}


class employee extends person
{
int emp_id;
String quali;
String com_name;
int salary;
employee()
{
 emp_id=0;
 quali=" ";
 com_name=" ";
 salary=0;
}
void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter employee id:");
 emp_id=sc.nextInt();
 System.out.println("Enter qualification:");
 quali=sc.next();
 System.out.println("Enter company name:");
 com_name=sc.next();
 System.out.println("Enter salary:");
 salary=sc.nextInt();
 }
void display()
 {
 System.out.println("Employee id:"+emp_id);
 System.out.println("Employee quaification:"+quali);
 System.out.println("Company name:"+com_name);
 System.out.println("Employee salary:"+salary);
 super.display();
 }
}


class teacher extends employee
{
String sub;
String dep;
int tea_id;
teacher()
{
 sub=" ";
 dep=" ";
 tea_id=0;
}
void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter subject name:");
 sub=sc.nextLine();
 System.out.println("Enter department name:");
 dep=sc.nextLine();
 System.out.println("Enter teacher id:");
 tea_id=sc.nextInt();
 }
void display()
 {
 System.out.println("Subject name:"+sub);
 System.out.println("Department name:"+dep);
 System.out.println("Teacher id:"+tea_id);
 super.display();
 }
}

class inherit 
{
 public static void main(String args[])
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Enter number of elements:");
 int n=in.nextInt();
 teacher t[]=new teacher[n];
 for (int i=0; i<n; i++)
 {
 t[i]=new teacher();
 t[i].read();
 }
 for (int i=0; i<n; i++)
 {
 System.out.println("\n\n****The details are****\n");
 t[i].display();
 }
 }
}
