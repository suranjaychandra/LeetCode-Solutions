import java.util.*;

public class Solution {
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[(i + k) % size] = nums[i];
        }
        for (int i = 0; i < size; i++) {
            nums[i] = temp[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, k);
        sc.close();
    }
}