class Solution {
    public int singleNumber(int[] nums) {
        // int x = Integer.MAX_VALUE;
        // for(int i = 0; i<nums.length; i++){
        //     for(int j=i+1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             nums[j] = x;
        //             nums[i] = x;
        //         }
        //     }
        // }
        // int res = 0;
        // for(int val : nums){
        //     if(val != x){
        //         res = val;
        //     }
        // }
        // return res;


        // int res = 0;
        // int x = Integer.MAX_VALUE;
        // for(int i = 0; i<nums.length; i++){
        //     for(int j=i+1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             nums[j] = x;
        //             nums[i] = x;
        //         }
        //     }
        //     if(nums[i] != x){
        //         res = nums[i];
        //     }
        // }

        // return res;



        // Arrays.sort(nums);
        // int res = 0;
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(i>0 && nums[i-1] == nums[i]){
        //         count++;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     if(count==1 && (i==nums.length-1 || nums[i] != nums[i+1])){
        //         res = nums[i];
        //     }
        // }
        

        // return res;



        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res = res^nums[i];
        }
        return res;

    }
}