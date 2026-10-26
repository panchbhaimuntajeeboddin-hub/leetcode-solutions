class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey,k,'T'),
        helper(answerKey,k,'F'));
    }
    public int helper(String s, int k,char target){
        int left=0;
        int count=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)!=target){
                count++;
            }
            while(count>k){
                if(s.charAt(left)!=target){
                    count--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna