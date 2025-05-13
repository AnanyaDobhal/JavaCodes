
    import java.util.*;
public class Program5 {
    
    public static void zigzag(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } 
            else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the size:");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements:");
for (int i=0;i<n;i++) 
{
arr[i]=sc.nextInt();
}
        zigzag(arr);
        System.out.println("Array in Zigzag fashion: ");
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }            
        sc.close();
    }
}


