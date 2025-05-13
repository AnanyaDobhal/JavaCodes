import java.io.*;
import java.util.*;
class Program19 {
    public static void main(String[] args) throws Exception { 
        int Count = 0;
        Scanner sc = new Scanner(new File("a.txt"));
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equals(str)){
                System.out.println(s);
                Count++;
            }
        }
        if(Count == 0){
            System.out.println("this word doesnot exist");
        }
        else{
            System.out.println("Times: " + Count);
        }
    }
}