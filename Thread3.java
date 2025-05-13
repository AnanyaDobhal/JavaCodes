//write a class Display having void wish(String name ) methods that wishes hello to given string name .
//Between priting hello and provided string name apply delay of 500ms. Suppose mutiple threads are there and 
// they are trying to access this wish() method concurrently on same object the irregularly output  will be there.
// Write this application in such a way so that output becomes regular.

import java.lang.*;
class Display {
    public synchronized void wish(String name) {
        try {
            System.out.print(Thread.currentThread().getName()+"   "+"Hello ");
            Thread.sleep(500); 
            System.out.println(name);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class A extends Thread{
    Display display;
    String name;

    A(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(name);
    }
}
class Thread3 {
    
    public static void main(String args[]) throws InterruptedException
    {
        Display display = new Display();
        A t1 = new A(display,"Ananya");
        A t2 = new A(display,"riya"); 
        A t3 = new A(display,"Sidhart");
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Rest of the code");
        System.out.println("Rest of the code");

    }
}
