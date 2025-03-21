import java.util.Scanner;
class Ashapes{
    int l,b,h;
    double r,pi=3.14;

    void  area(double r)
    {
        System.out.println("Area of circle:"+ pi * r* r);
            
    }
    void area(double b,double h)
    {   
        System.out.println("Area of triangle:"+ 0.5 *b * h);
        
    }
    void area(int s)
    {
        System.out.println("Area of square:"+ s * s);
        
    }
    void area(int l,int W)
    {
        System.out.println("Area of rectangle:"+ l * W);
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Ashapes obj=new Ashapes();

         System.out.println("Enter the radius of circle:");
         double r=sc.nextDouble();
         obj.area(r);

         System.out.println("Enter the breadth  of triangle:");
        double b=sc.nextDouble();
        System.out.println("Enter the height of triangle:");
        double h=sc.nextDouble();
        obj.area(b,h); 
        
        System.out.println("Enter the side of square:");
        int a=sc.nextInt();
         obj.area(a);

        System.out.println("Enter the length of rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter the Width of rectangle:");
        int w=sc.nextInt();
         obj.area(l,w); 

        
    }
}