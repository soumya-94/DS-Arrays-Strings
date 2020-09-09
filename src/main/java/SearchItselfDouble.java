/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 */

import java.util.HashSet;
import java.util.Hashtable;

public class SearchItselfDouble {

    public static boolean checkIfExist(int arr[]) {

        HashSet<Integer> set = new HashSet<Integer>();

        for(int num : arr) {
            if(num%2==0 && set.contains(num/2) || set.contains(2*num))
                return true;
            else
                set.add(num);
        }
        return false;

        /*
        if (arr == null || arr.length == 0)
            return false;

        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

        for(int i=0; i<arr.length; i++) {

            if(arr[i]==0 && table.contains(0))
                return true;
            if(table.contains(2 * arr[i]))
                return true;
            if(arr[i]%2==0 && table.contains(arr[i]/2))
                return true;
            table.put(i, arr[i]);
        }
        return false;
         */
    }

    public static void main (String ar[]) {

        int nums[] = {10,2,7,3};

        System.out.println(checkIfExist(nums));

    }

}
