class Solutiontwosum {
    
    public int[] twoSum(int[] nums, int target) {
        int b=nums.length;
        
        for (int i=0 ; i<=b;i++){
            int c=nums[i];
            int z=target - c;
            for (int j = (i+1); j < b; j++) {
                if (z== nums[j] ) {
                    return new int[] { i, j };

                    
                }
                
            }
        } return null;
    }
}
