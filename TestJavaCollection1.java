import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
System.out.println(list);
System.out.println("Returning element: "+list.get(1));
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
} 
System.out.println("Updating the list"); 
list.set(1,"Arun");  
Iterator itr1=list.iterator();  
while(itr1.hasNext()){  
System.out.println(itr1.next());  
} 
System.out.println("Removed element: "+list.remove(2));
Iterator itr2=list.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
} 
System.out.println("Array contains: "+list.contains("Arun"));
Iterator itr3=list.iterator();  
while(itr3.hasNext()){  
System.out.println(itr3.next());  
} 
System.out.println("Array size: "+list.size());
Collections.sort(list);
System.out.println(list);
list.clear();
System.out.println(list);
}  
}  
