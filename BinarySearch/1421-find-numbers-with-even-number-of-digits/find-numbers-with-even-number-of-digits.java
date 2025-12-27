class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num: nums) {
            if (num < 0) {
                num = num * -1;
            }
            int digits = (int)Math.log10(num) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}