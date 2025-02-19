import java.util.Scanner;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.print(searchInsert(arr, target));
    }
}