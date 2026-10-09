class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();// 4 row
        for(int i=n-2;i>=0;i--){//2 last hai row
        for(int j=0;j<=i;j++){
            int below1=triangle.get(i+1).get(j);
            int below2=triangle.get(i+1).get(j+1);
            int min=Math.min(below1,below2);
            triangle.get(i).set(j,triangle.get(i).get(j)+min);
        }
           }
           return triangle.get(0).get(0);
         }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna