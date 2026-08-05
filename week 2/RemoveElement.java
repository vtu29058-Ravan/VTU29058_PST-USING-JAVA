import java.util.Arrays;

class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        RemoveElement r = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = r.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));
    }
}