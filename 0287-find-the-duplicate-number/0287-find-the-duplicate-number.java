class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return num;
            }
          seen.add(num);  
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna