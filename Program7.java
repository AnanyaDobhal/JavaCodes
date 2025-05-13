import java.util.Scanner;
class Program7 {
    public static void  saddlePoint(int arr[][] )
    {
        for(int i=0;i<3;i++){
            int minelement = arr[i][0];
            int minIndex = 0;
            for(int j=1;j<3;j++){
                if(arr[i][j] < minelement){
                    minelement = arr[i][j];
                    minIndex = j;
                }
            }
            boolean check = true;
            for(int j=0;j<3;j++){
                if(arr[j][minIndex] > minelement){
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Saddle Point found at (" + i + ", " + minIndex + ") with value: " + minelement);
                return; 
            }
        }
        
        System.out.println("No saddle point found");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        saddlePoint(arr);
        sc.close();
    }
}
