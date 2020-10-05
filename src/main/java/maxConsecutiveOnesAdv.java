/*
Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most k 0s
 */

public class maxConsecutiveOnesAdv {

    public static int find(int ar[], int k) {

        int i=0, j=0;

        while (i < ar.length) {

            if(ar[i] == 0) k--;

            if( k < 0) {
                if(ar[j] == 0) k++;
                j++;
            }
            i++;
        }
        return i-j;
    }

    public static void main(String ar[]) {

        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println("answer:"+find(arr, k));

    }

}
