class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
           arr[0] = nums[0];
           arr[2*n-1] = nums[2*n-1];
           int t = 0;
        for (int i = 1; i < 2*n-1; i+=2){
              arr[i] = nums[n+t];
              arr[i+1] = nums[i-t];
              t++;
        }

        return arr;
    }
}
