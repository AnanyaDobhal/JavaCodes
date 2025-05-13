import java.lang.*;
class CSthread extends Thread{
    public void run()
    {
        int i=0;
        while(true){
            i++;
            System.out.println(i+ " : CSThread");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class ITthread extends Thread
{
    public void run()
    {
        int j=0;
        while(true){
            j++;
            System.out.println(j+ " : ITthread");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Program19 {
    public static void main(String args[])
    {
        CSthread t1 = new CSthread();
        ITthread t2 = new ITthread();
        t1.start();
        t2.start();
    }
    
}
