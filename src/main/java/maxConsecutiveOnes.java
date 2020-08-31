public class maxConsecutiveOnes {

    public static int find(int [] nums) {

        int count = 0, max = 0;
        for (int n : nums) {
            if(n == 1) {
                count++;
                if(count > max)
                    max = count;
            }
            else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String ar[]) {

        int arr[] = {1,1,1,1,0,1,1,1};
        System.out.println("answer:"+find(arr));

    }

}
