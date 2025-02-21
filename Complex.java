import java.util.Scanner;
public class Complex {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the real part of first complex number: ");
 int r1 = sc.nextInt();
 System.out.println("Enter the complex part of first complex number: ");
 int c1 = sc.nextInt();
 System.out.println("Enter the real part of first complex number: ");
 int r2 = sc.nextInt();
 System.out.println("Enter the imaginary part of second complex number: ");
 int c2 = sc.nextInt();
 
 int realsum=r1+r2;
 int imgsum=c1+c2;
 System.out.println("Sum of complex numbers: " +realsum+"+"+imgsum+"i");
 }
}
