/*
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
 */

import java.util.Arrays;

public class Heights {

    public static int heigthChecker(int heights[]) {

        int sortedHeights [] = new int [heights.length];
        for(int i=0; i<heights.length; i++)
            sortedHeights[i] = heights[i];
        Arrays.sort(sortedHeights);
        int count=0;
        for(int i=0; i<heights.length; i++) {
            if(heights[i] != sortedHeights[i]) count++;
        }
        return count;
    }

    public static void main (String ar[]) {

        int nums[] = {1,1,4,2,1,3};

        System.out.println(heigthChecker(nums));
    }
}
