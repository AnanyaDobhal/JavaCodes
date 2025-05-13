import java.util.*;
class Program11 {
    void arrayFunc(int arr[], int target){
        System.out.println("Pairs of elements whose sum is " + target + " are :  ");
        int n = arr.length;
        for(int i =0;i<n; i++){
            for(int j = i+1 ; j< n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
    
    void arrayFunc(int A[], int p, int B[], int q){
        int i = 0;  
        int j = 0;  
        while(i < p && j < q){
            if(A[i] < B[j]){
                i++;
            } else {
                int temp = A[i];
                A[i] = B[j];
                B[j] = temp;
                Arrays.sort(B);  
                i++;
            }
        }
        System.out.println("Sorted Array: ");
        System.out.print("A: ");
        for(int x = 0; x < p; x++) {
            System.out.print(A[x] + " ");
        }
        System.out.println();  
        System.out.print("B: ");
        for(int x = 0; x < q; x++) {
            System.out.print(B[x] + " ");
        }
        System.out.println();  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        Program11 p11 = new Program11();
        p11.arrayFunc(arr, target);
        System.out.println();
        int A[] = { 1, 5, 6, 7, 8, 10 };
        int B[] = {2, 4, 9};
        System.out.print("Orignal array 'A': ");
        for(int i = 0;i<6;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("Orignal array 'B': ");
        for(int i = 0;i<3;i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
        p11.arrayFunc(A, A.length, B, B.length);
        sc.close();
    }
}


