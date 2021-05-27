import java.util.Scanner;
class student
{
 String name,place;
 int age;
 String course;
 int m1,m2,m3;
 Scanner sc=new Scanner(System.in);
 Scanner s=new Scanner(System.in);
 void readdata()
 {
  System.out.println("Enter the name:");
  name=sc.nextLine();
  System.out.println("Enter the Age:");
  age=s.nextInt();
  System.out.println("Enter the course:");
  course=sc.nextLine();
  System.out.println("Enter the place:");
  place=sc.nextLine();
 }
 void totalmark()
 {
  int tot=0;
  System.out.println("Enter the 3 subject mark:");
  m1=s.nextInt();
  m2=s.nextInt();
  m3=s.nextInt();
  tot=m1+m2+m3;
  System.out.println("The totel mark of the student  is: "+tot);
 }
 void display()
 {
   
  System.out.println("Name is:"+name);
  System.out.println("Age is:"+age);
  System.out.println("Place is:"+place);
  System.out.println("Course is:"+course);
  
}
}
class stud
{
 public static void main(String args[])
 {
   student s=new student();
   s.readdata();
   s.totalmark();
   s.display();
  }
}
