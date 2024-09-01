public class smallestinarray {
    public static void main(String[] args) {
        int g = tosat();
        System.out.print(g);


    }

    public static int tosat(){

        int[] nums={4,5,6,1,-2,-3};
        int left = 0;
        int right = nums.length - 1;
//        System.out.println(nums.length);    6

        while (left < right) {  // loop will execute until left is smaller than right

            int mid = left + (right - left) / 2;  // find the mid-value
            // Check if the middle element is greater than the right element
            if (nums[mid] > nums[right]) {
                left = mid + 1; // we transfer the low to mid + 1
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

}

