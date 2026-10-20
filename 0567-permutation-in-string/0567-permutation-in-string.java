class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[]count=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
         }
         for(int i=0;i<s1.length();i++){
            count[s2.charAt(i)-'a']--;
         }
         if(allZero(count)){
            return true;    
         }
         for(int i=s1.length();i<s2.length();i++){
            count[s2.charAt(i-s1.length())-'a']++;
            count[s2.charAt(i)-'a']--;
         if(allZero(count)){
            return true;    
         }
        }
        return false;
    }
     private boolean allZero(int[] count){
        for(int value:count){
            if(value!=0){
                return false;
            }
        }
        return true ;
     }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna