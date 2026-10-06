class Solution {
    public String addStrings(String nums1, String nums2) {
        int i=nums1.length()-1;
        int j=nums2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0||j>=0||carry>0){
            int digits1=0;
            int digits2=0;
            if(i>=0){
                digits1=nums1.charAt(i)-'0';
            }
            if(j>=0){
                digits2=nums2.charAt(j)-'0';
            }
            int sum=digits1+digits2+carry;
            result.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
         return result.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna