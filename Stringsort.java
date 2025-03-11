import java.util.*;
class Stringsort{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of strings:");
int n=sc.nextInt();
sc.nextLine();
String arr[]=new String[n];
System.out.println("Enter" +n+ "string:");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextLine();
}
 for(int i=0;i<arr.length-1;i++)
 {
 for(int j=i+1;j<arr.length;j++)
 {
 if(arr[i].compareTo(arr[j])>0))
 {
String temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Sorted strings");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
