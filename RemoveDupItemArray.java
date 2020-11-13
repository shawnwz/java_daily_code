//given a sorted num[], return a len and num[] that first len of item is not duplicated.
//require space complexity is o(1)
//eg.   [1,1,2]  => 2 and [1,2,1]
//eg. [0,0,1,1,1,2,2,3,3,4] => 5 and [0,1,2,3,4,...]

public class RemoveDupItemArray {



    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int temp = nums[0];
        int len = 1;
        for (int i=1; i<nums.length; i++) {

            if (nums[i] != temp) {
                nums[len] = nums[i];
                temp = nums[i];
                len++;
            }
        }

        System.out.println(len);
        for (int i=0; i< len; i++){
            System.out.println(nums[i]);
        }
    }


}
