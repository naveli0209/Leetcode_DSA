class Solution {
    public void sortColors(int[] nums) {

        // two variable approach

        // int start = 0;
        // int end = nums.length - 1;
        // int mid = 0;

        // while(mid <= end){
        //     if(nums[mid] == 0){
        //         int temp = nums[start];
        //         nums[start] = nums[mid];
        //         nums[mid] = temp;
        //         mid++;
        //         start++;
        //     }
        //     else if(nums[mid] == 1){
        //         mid++;
        //     }
        //     else{
        //         int temp = nums[end];
        //         nums[end] = nums[mid];
        //         nums[mid] = temp;
        //         end--;
        //     } 

        // }

        // for(int i : nums){
        //     System.out.print(i + " ");
        // }


        // counting approach

        int zeroC = 0;
        int oneC = 0;
        int twoC = 0;

        for(int i : nums){
            if(i == 0){
                zeroC++;
            }
            else if(i == 1){
                oneC++;
            }
            else{
                twoC++; 
            }
        }

        int j = 0;
        while(zeroC>0){
            nums[j] = 0;
            j++;
            zeroC--;
        }
        while(oneC>0){
            nums[j] = 1;
            j++;
            oneC--;
        }
        while(twoC>0){
            nums[j] = 2;
            j++;
            twoC--;
        }

    }
}