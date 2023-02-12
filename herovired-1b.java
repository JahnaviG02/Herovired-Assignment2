import java.util.Arrays;
import java.util.Scanner;

public class CSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }

        for(int i = 1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }

        System.out.println("Cumulative Sum: "+ Arrays.toString(arr));
    }
}