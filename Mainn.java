class Cpu
{
    int price;

    class Processor
    {
        int cores;
        String manufacturer;
    }

    static class Ram
    {
        int memory;
        String manufacturer1;
    }
}
public class Mainn{
public static void main(String[] args) {


Cpu myobj1=new Cpu();
Cpu.Processor myobj2=myobj1.new Processor();
myobj2.cores=6;
myobj2.manufacturer="intel";
myobj1.price=4990;

Cpu.Ram myobj=new Cpu.Ram();
myobj.memory=600;
myobj.manufacturer1="pentium";




System.out.println("The price is:"+myobj1.price);
System.out.println("The No.of.cores used is:"+myobj2.cores);
System.out.println("The manufacturer is:"+myobj2.manufacturer);
System.out.println("The memory size is:"+myobj.memory+"GB");
System.out.println("The manufacturer1 is:"+myobj.manufacturer1);
}
}
