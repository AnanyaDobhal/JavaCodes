import java.lang.*;

class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
public class Thread4 {
    public static void main(String[] args) throws InterruptedException{
        A t1 = new A();
        t1.start();
        t1.join(1600); // time limiting 
        System.out.println("Rest of code");
    }
}
