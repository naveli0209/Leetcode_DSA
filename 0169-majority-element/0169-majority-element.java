import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        // Moore's voting algo
        int n = nums.length;
        int freq = 0;
        int maj_ele = nums[0];
        for(int i = 0; i < n; i++){
            if(freq == 0){
                maj_ele = nums[i];
            }

            if(maj_ele == nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return maj_ele;


        // Optimized Solution (O(n log n))
        // int n = nums.length;
        // Arrays.sort(nums);
        // int freq = 1;
        // int maj_ele = nums[0];
        // for(int i=0; i<n; i++){
        //     if(i>0 && nums[i] == nums[i-1]){
        //         freq++;
        //     }
        //     else{
        //         freq = 1;
        //     }
        //     if(freq > Math.floor(n/2)){
        //         maj_ele = nums[i];           
        //     }
        // }
        // return maj_ele;




        //Brute Force Approach  (O(n^2))
        // int n = nums.length;
        // int maj_ele = 0;
        // for(int i : nums){
        //     int freq = 0;
        //     for(int j : nums){
        //         if(j==i){
        //             freq++;
        //         }
        //     }
        //     if(freq > Math.floor(n/2)){
        //         maj_ele = i;
        //     } 

        // }
        // return maj_ele;
    }
}