import java.util.*;    
class Priorityqueue {    
    public static void main(String args[]) {    
        // Creating a PriorityQueue of Strings  
        PriorityQueue<Integer> qu = new PriorityQueue<Integer>();    
        // Adding elements to the PriorityQueue  
        qu.add(39);    
        qu.add(19);    
        qu.add(89);    
        qu.offer(29);    
        qu.offer(67);    
        
       System.out.println("Priority queue:"+qu);
       System.out.println("peek element:" +qu.peek());
       System.out.println("element removed is:" +qu.remove());
       System.out.println("size of the priority queue:" +qu.size());
       System.out.println("check the  priority queue empty: " +qu.isEmpty());
       System.out.println("Whether queue contains 20:" +qu.contains(20));
       qu.clear();
       System.out.println(qu);

       }
       }
