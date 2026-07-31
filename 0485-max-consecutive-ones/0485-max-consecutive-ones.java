class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0; 
        int temp = 0;
        for(int i : nums){
           if(i == 1){
            temp++;
            if(temp > max_count){
                max_count = temp;
            }
            // max_count = Math.max(max_count, temp);
           }
           else{
            temp = 0;
           }
        }


        return max_count;
    }
}