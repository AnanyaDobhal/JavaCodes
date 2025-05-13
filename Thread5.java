class A {
    public synchronized void sum(){
        System.out.println("sum....");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i+2);
        }
    }
    public synchronized void mul(){
        System.out.println("MUltiplication....");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*5);
        }
    }
}
class B extends Thread{
    A obj;
    B(A obj){
        this.obj = obj;
    }
    public void run(){
        obj.sum();
        obj.mul();
    }
}

class Thread5 {
    public static void main(String args[])
    {
        A obj = new A();
        B t1 = new B(obj);
        B t2 = new B(obj);

        t1.start();
        t2.start();
    }
}
