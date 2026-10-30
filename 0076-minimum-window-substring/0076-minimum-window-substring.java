class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] freq=new int[128];   
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        } 
        int start=0;
        int left=0;
        int right=0;
         int minLen = Integer.MAX_VALUE;
        int required=t.length();
        for(right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                required--;
            }
            freq[ch]--;
            while(required==0){
                int windowLen=right-left+1;
                if(windowLen<minLen){
                    minLen=windowLen;
                    start=left;
                }
                char leftChar=s.charAt(left);
                freq[leftChar]++;
                if(freq[leftChar]>0){
                required++;
            }  
            left++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLen);
    }   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna