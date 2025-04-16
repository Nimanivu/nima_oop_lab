import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        try {
            
           System.out.print("Enter the limt to enter: ");
            int n = sc.nextInt();

            FileWriter writer = new FileWriter("number.txt");


           
            FileWriter even = new FileWriter("evennum.txt");
            FileWriter odd = new FileWriter("oddnum.txt");
            System.out.println("Enter the "+n+" integers:");
            for (int i = 0; i < n; i++)
             {
                int num = sc.nextInt();
                writer.write(num + " ");

         
    
                if (num % 2 == 0) {
                    even.write(num + " ");
                } else {
                    odd.write(num + " ");
                }
            }
         

         
            sc.close();
            even.close();
            odd.close();

            System.out.println("Even and Odd numbers have been successfully separated to different files.");

        } catch (FileNotFoundException e) {
            System.out.println("The input file 'num.txt' was not found!");
        } catch (IOException e) {
            System.out.println("An error occurred during file writing.");
            e.printStackTrace();
        }
    }
}

