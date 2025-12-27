class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pair = {-1, -1};

        int startValue = searchIndex(nums, target, true);
        int endValue = searchIndex(nums, target, false);

        pair[0] = startValue;
        pair[1] = endValue;

        return pair;
    }

    int searchIndex (int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = end - (end-start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}