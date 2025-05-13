import java.util.*;
class Program6 {
    public static void reArrange(int arr[],int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                if(arr[j]>=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reArrange(arr,n);
        System.out.println("Rearranged array (negative numbers at the beginning):");
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
