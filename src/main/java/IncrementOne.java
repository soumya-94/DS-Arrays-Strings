public class IncrementOne {

    public static int [] plusOne(int[] digits) {

        int n = digits.length;

        for (int i=n-1; i>=0; i--) {

            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int [] new_num = new int[n+1];
        new_num[0] = 1;
        return new_num;

    }

    public static void main(String ar[]) {

        int digits[] = {1,2,3,7};
        System.out.println(plusOne(digits));

    }

}
