/*

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

 */

public class MergeSortedArrays {

    public static void merge (int [] nums1, int m, int [] nums2, int n) {

        if(m==0)
        {
            for(int i=0; i<n; i++){
                nums1[i] = nums2[i];
            }
        }

        int count = m+n-1;
        m--;
        n--;

        while (m>=0 || n>=0) {
            if (m >= 0 && n >= 0) {
                if (nums1[m] > nums2[n]) {
                    nums1[count] = nums1[m];
                    m--;
                } else {
                    nums1[count] = nums2[n];
                    n--;
                }
            }
            else if (n>=0) {
                nums1[count] = nums2[n];
                n--;
            }
            if(n<0) break;
            count--;
        }
    }

    public static void main (String ar[]) {

        int nums1 [] = {1,2,3,0,0,0};
        int nums2 [] = {2,5,6,};
        int m=3, n=3;

        merge(nums1,m,nums2,n);

        for(int num : nums1) {
            System.out.print(num+", ");
        }

    }

}
