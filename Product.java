public class Product{
String pcode;
String pname;
int price;
 public static void main(String[] args) {
 Product myObj1 = new Product();
  Product myObj2 = new Product();
   Product myObj3 = new Product();
    
    myObj1.pcode="p001";
    myObj1.pname="handwash";
    myObj1.price=200;
    
    myObj2.pcode="p002";
    myObj2.pname="sugar";
    myObj2.price=150;
    
    myObj3.pcode="p003";
    myObj3.pname="soap";
    myObj3.price=50;
    
    if(myObj1.price < myObj2.price && myObj1.price < myObj3.price)
    System.out.println("product 1 is lowest"+" "+ myObj1.pcode +" "+ myObj1.pname +" "+ myObj1.price);
    else if(myObj2.price < myObj3.price && myObj2.price < myObj1.price)
    System.out.println("product 2 is lowest"+" "+ myObj2.pcode +" "+ myObj2.pname +" "+ myObj2.price);
    else
    System.out.println("product 3 is lowest"+" "+ myObj3.pcode +" "+ myObj3.pname +" "+ myObj3.price);
    
 }
}

