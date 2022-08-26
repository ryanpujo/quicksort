import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {8,7,2,1,9,5,4,3,6};
        int[] result = quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partition = partition(nums, low, high);
            quickSort(nums, low, partition-1);
            quickSort(nums, partition+1, high);
        }
        return nums;
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int temp;
        int i = low -1;
        for(int j = low;j <= high-1;j++) {
            if (nums[j] < pivot) {
                i++;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
        return (i+1);
    }
}
