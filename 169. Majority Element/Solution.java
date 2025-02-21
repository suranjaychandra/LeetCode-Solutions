class Solution {
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        int count = 1;
        int first = nums[0];
        for(int i = 0 ; i < length; i++)
        {
            if(nums[i] == first)
            {
                count++;
            }
            else{
                count--;
                if(count == 0)
                {
                    first = nums[i];
                    count = 1;
                }
            }

        }
        return first;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
      
        System.out.print(majorityElement(arr) + " ");  
        

    }
}