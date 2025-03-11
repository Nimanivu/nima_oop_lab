import java.util.*;

 class Smanipulation{
 
  public static void main(String[] args) {
  String s1;
  String s2;
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the String:");
   s1 = sc.nextLine();
   System.out.println("enter the String:");
   s2 = sc.nextLine();
   System.out.println("String position charAt(1)"+s1.charAt(1));
   System.out.println("string contains:"+s1.contains("hi"));
   System.out.println("String one equals String two:"+s1.equals(s2));
   System.out.println("String length of s1:"+s1.length());
   System.out.println("Replace string s1:"+s2.replace('a','r'));
   System.out.println("String one startswith:"+s1.startsWith("al"));
   System.out.println("Substring of string one:"+s2.substring(3,7));
   System.out.println("Uppercase of string two:"+s2.toUpperCase());
   
   			
  }
}
