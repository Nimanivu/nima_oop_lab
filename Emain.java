import java.util.Scanner;
class Employee{
int eNo;
String eName;
String eSalary;

Employee(int eNo,String eName,String eSalary){
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
public void Employeedetails()
{
System.out.println("Employee details:");
System.out.println("Employee No: "+this.eNo+","+"Employee Name:"+this.eName+","+"Employee Salary:"+this.eSalary);
}
}
class Emain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the  number of employees:");
int n = sc.nextInt();

Employee emp[]=new Employee[n];

for(int i=0;i<n;i++)
{
System.out.println("enter the employee number:");
int o = sc.nextInt();
sc.nextLine();
System.out.println("enter the employee name:");
String m = sc.nextLine();
System.out.println("enter the employee salary:");
String s = sc.nextLine();

emp[i]=new Employee(o,m,s);
}

System.out.println("Enter the employee number to search:");
int searcheno=sc.nextInt();
boolean found=false;
for(int i=0;i<n;i++)
{
if(emp[i].eNo==searcheno)
{
emp[i].Employeedetails();
found=true;
break;
}
}
if(!found)
{
System.out.println("Employee number not found");
}
}
}

