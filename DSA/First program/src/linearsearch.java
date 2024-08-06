public class binary {
//linear search
    public static void main(String[] args) {
        int[] nums = {45, 18, 7, 10, 17};
        int target = 17;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        for (int search = 0; search < nums.length; search++) {
            int linear = nums[search];
            if (linear == target) {
                return search;
            }
        }
        return -1;
    }
}


