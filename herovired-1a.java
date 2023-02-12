import java.util.Arrays;
import java.util.Scanner;
public class CSum {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++) {
          arr[i]=sc.nextInt();
       }

        int[] cum = new int[arr.length];
        cum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cum[i] = cum[i - 1] + arr[i];
        }

        System.out.println("Cumulative Sum: " + Arrays.toString(cum));
    }
}