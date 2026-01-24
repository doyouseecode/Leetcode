class Solution {
    public int removeDuplicates(int[] nums) {
        int uniquesIndex = 1, lastUnique = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != lastUnique){
                nums[uniquesIndex++] = nums[i];
                lastUnique = nums[i];
            }
        }

//        System.out.println(Arrays.toString(nums));

        return uniquesIndex;
    }
}