class Employee{
int eNo;
String eName;
int eSalary;

Employee(int eNo,String eName,String eSalary){
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
public void Employeedetails()
{
System.out.print("Employee details:");
System.out.println(this.eNo+","+this.eName+","+this.eSalary;);
}
}
