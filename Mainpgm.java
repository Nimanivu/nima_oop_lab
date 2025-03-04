import java.util.Scanner;
class Student
{
String name;
int rollno;
String section;


Student(String name,String section,int rollno){
this.name=name;
this.section=section;
this.rollno=rollno;
}
public void Studentdetails()
{
System.out.print("Student details:");
System.out.println(this.name+","+this.rollno+","+this.section);
}
}
class Mainpgm{
public static void main(String args[]){

Student stud[]=new Student[3];
for(int i=0;i<3;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name:");
String n = sc.nextLine();
System.out.println("enter the section:");
String s = sc.nextLine();
System.out.println("enter the roll no:");
int r = sc.nextInt();

stud[i]=new Student(n,s,r);
}
for(int i=0;i<3;i++)
{
stud[i].Studentdetails();
}

}
}
