/*public class MajorityElement {
    public static int majorityElements(int[] nums) {  //brute force approach TC= O(n^2)
        int majorityCount = nums.length/2;
        for(int i = 0;i < nums.length;i++) {
            int count = 0;
            for(int j = 0;j < nums.length;j++) {
                if(nums[j] == nums[i]) {
                    count += 1;
                }
            }
            if(count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElements(nums));
    }
}*/

public class MajorityElement { //divide and conquer
    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementsRec(int[] nums, int lo, int hi) {
        // Base case: the only element in an array of size 1 is the majority element
        if (lo == hi) {
            return nums[lo];
        }

        // Recurse on left and right halves of this slice
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementsRec(nums, lo, mid);
        int right = majorityElementsRec(nums, mid + 1, hi);

        // If two halves agree on the majority element, return it
        if (left == right) {
            return left;
        }

        // Otherwise
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majority_Elements(int[] nums) {
        return majorityElementsRec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority_Elements(nums));
    }
}