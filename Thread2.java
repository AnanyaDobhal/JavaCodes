import java.lang.*;
class Table
{
    public synchronized void ptable(int x){ // if we add public synchronized 
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*x);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class A extends Thread{
    Table t;
    A(Table t){
        this.t = t;
    }
    public void run(){
        t.ptable(5);
    }
}

class B extends Thread{
    Table t;
    B(Table t){
        this.t = t;
    }
    public void run(){
        t.ptable(2);
    }
}
class Thread2 {
    public static void main(String args[])
    {
        Table tt = new Table();
        A t1 = new A(tt);
        B t2  = new B(tt);
        t1.start();
        t2.start();
    }
}
