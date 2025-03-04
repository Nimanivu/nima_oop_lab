class Student
{
String name;
int rollno;
String section;


Student(String name,int rollno,String section){
this.name=name;
this.rollno=rollno;
this.section=section;
}
public void Studentdetails()
{
System.out.print("Student details:");
System.out.println(this.name+","+this.rollno+","+this.section);
}
}
class Mainpgrm{
public static void main(String args[]){
Student stud1=new Student("anjana",34,"A");
Student stud2=new Student("alphy",20,"B");
Student stud3=new Student("keerthi",34,"A");

stud1.Studentdetails();
stud2.Studentdetails();
stud3.Studentdetails();


}
}
