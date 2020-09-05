/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.
 */

public class DuplicateZeros {

    public static void duplicate(int [] arr) {

        int possible_dupes = 0; //number of duplicate zeros we will need
        int len = arr.length - 1;

        //one pass through the array to calculate number of duplicate zeros required
        //traverse till you have reached the last element that can be accommodated (length of array - duplicates)
        for (int i=0; i<= len-possible_dupes; i++) {

            //increase number of duplicates when element is 0
            if (arr[i] == 0) {

                //when the last value to be accomodate is also a zero but we cannot fit its duplicate
                if (i==len-possible_dupes) {
                    arr[len] = 0; //copy the zero to the last position
                    len--; //decrease the length that we need to fill
                }
                possible_dupes++;
            }
        }

        //start picking values from the end of the accommodated values
        int last = len - possible_dupes;

        for (int i=last; i>=0; i--) {

            //if current element is 0, fill it twice, also decrease the no. of duplicates
            if(arr[i] == 0) {
                //insert the value keeping space for fitting duplicates
                arr[i+possible_dupes] = arr[i];
                possible_dupes--;
                arr[i+possible_dupes] = arr[i];
            }

            //if current element is not 0, fill only once
            else
            {
                arr[i+possible_dupes] = arr[i];
            }
        }

    }

    public static void main (String ar[]) {

        int [] nums = {1,0,2,3,0,4,5,0};

        duplicate(nums);

        for (int num : nums) {
            System.out.print(num+", ");
        }

    }

}
