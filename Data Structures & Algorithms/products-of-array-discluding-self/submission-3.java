class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefixArray = new int[length];
        prefixArray[0] = nums[0];
        int[] suffixArray = new int[length];
        suffixArray[length-1] = nums[length-1];
        int[] result = new int[length];

        for (int i=1; i<length; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i];
            suffixArray[length-i-1] = suffixArray[length-i] * nums[length-i-1];
        }

        for (int i=0; i<length; i++){
            if (i==0) result[i] = suffixArray[1];
            else if (i==length-1) result[i] = prefixArray[length-2];
            else result[i] = prefixArray[i-1] * suffixArray[i+1];
        }

        return result;
    }
}  
