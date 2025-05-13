import java.lang.*;
import java.util.Scanner;
class stringsPractice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Single word 
        /*String n = sc.next();
        sc.nextLine();

        // onr or more than one words (include space)
        String fullname = sc.nextLine();
        System.out.println("Name: " + n);
        System.out.println("Full name: " + fullname);

        //concatenation
        String firstname = sc.next();
        String lastname = sc.next();
        String name = firstname + " " +lastname;
        System.out.println(name1);

        //length calculation;
        System.out.println(name.length());

        //charAt
        for(int i =0;i<name1.length(); i++){
            System.out.println(name.charAt(i));
        }*/

        //compare- 
        //         s1.compareTo(s2);
        // 1-> s1 > s2 : +ve value
        // 2-> s1 == s2 : 0 value
        // 3-> s1< s2 : -ve value
        String name1 = "Hello";
        String name2 = "Hello";
        if(name1.compareTo(name2) == 0){
            System.out.println("Equal");
        }
        else{
            System.out.println("not Equal");
        }
        // is equals to(==)
        if(name1 == name2){
            System.out.println("Equal");
        }
        else{
            System.out.println("not Equal");
        } 
        //(==) fail for many cases 
        //example-
        if(new String("Hello") == name2){
            System.out.println("Equal");
        }
        else{
            System.out.println("not Equal");
        }

        
    }
}