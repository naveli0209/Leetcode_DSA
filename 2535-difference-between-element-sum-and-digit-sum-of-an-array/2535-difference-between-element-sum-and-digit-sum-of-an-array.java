class Solution {
    public int differenceOfSum(int[] nums) {

        int element_sum = 0;
        int digit_sum = 0;
        for(int i : nums){
            element_sum += i;
            int last_digit = 0;
            while(i>0){
                last_digit = i%10;
                digit_sum += i%10;
                i = i/10;
            }
        }

       
        for(int i = 0; i < nums.length; i++){
            
        }

        return Math.abs(element_sum-digit_sum) ;

    }
}