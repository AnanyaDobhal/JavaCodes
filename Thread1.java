import java.lang.*;
class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("THis is thread A"+i);
        }
        System.out.println("Thread A is finished");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("THis is thread B"+i);
        }
        System.out.println("Thread B is finished");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("THis is thread C"+i);
        }
        System.out.println("Thread C is finished");
    }
}
class Thread1 {
    public static void main(String args[]) throws InterruptedException{
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join(); // this will first execute thread t1 and then move to other threads
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setName("thread-01");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        
    }
}
