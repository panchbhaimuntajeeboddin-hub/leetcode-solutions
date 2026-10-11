class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }
    public String process(String str){
        StringBuilder result=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }
                }else{
                    result.append(ch);
                }
        }
        return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna