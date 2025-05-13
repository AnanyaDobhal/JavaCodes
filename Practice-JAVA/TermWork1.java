import java.util.Scanner;
import java.lang.String;
public class TermWork1 {

    static String inserting(String orignal, String StringToInsert,int index){
        String part1 = "";
        String part2 = "";
        for(int i = 0; i < orignal.length();i++){
            if(i<index){
                part1 = part1 + orignal.charAt(i);
            }
            else{
                part2 = part2 + orignal.charAt(i);
            }
        }

        String result = part1 + StringToInsert + part2;
        return result;
    }

    static String usingPredefinedMethod(String orignal, String ToInsert, int index)
    {
        String part1 = orignal.substring(0,index);
        String part2 = orignal.substring(index);

        return part1 + ToInsert + part2;
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String orignal = sc.next();
        String StringToInsert = sc.next();
        int index = sc.nextInt();
        
        String output1 = inserting(orignal,StringToInsert,index);
        System.out.println(output1);

        String output2 = usingPredefinedMethod(orignal,StringToInsert,index);
        System.out.println(output2);

        sc.close();
    }
}
