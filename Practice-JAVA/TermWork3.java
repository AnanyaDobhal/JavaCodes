import java.util.Arrays;
import java.util.Scanner;
public class TermWork3 {

    static void withoutInbuiltFunction(String str){
        char arr[] = str.toCharArray();
        for(int i = 0;i< arr.length; i++){
            for(int j = 0;j< arr.length - i-1; j++){
                if (arr[j] > arr[j + 1]) {
                    // Swap characters
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String sorted = new String(arr);
        System.out.println(sorted);
    }
    static void StringSortWithInbuiltFunction(String str) {
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars);

        String sortedString = new String(chars);
        
        System.out.println("Sorted string: " + sortedString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        withoutInbuiltFunction(str);
    }
    
}
