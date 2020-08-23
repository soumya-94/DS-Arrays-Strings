
import java.util.Scanner;

public class PrintArrayInReverse {

    public static void main (String arr[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a [] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        //System.out.println(n);
        for (int i=n-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }

}
