class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
         char a=s.charAt(i);
         char b=s.charAt(i+1);
         char c=s.charAt(i+2);
         if(a!=b&&b!=c&&a!=c){
            count++;
         }
        }
return count++;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna