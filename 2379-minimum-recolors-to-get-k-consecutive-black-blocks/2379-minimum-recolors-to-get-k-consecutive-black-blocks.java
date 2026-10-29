
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
        }

        int min = count;

        for (int i = k; i < blocks.length(); i++) {

            // Remove outgoing block
            if (blocks.charAt(i - k) == 'W') {
                count--;
            }

            // Add incoming block
            if (blocks.charAt(i) == 'W') {
                count++;
            }

            min = Math.min(min, count);

            if (min == 0) {
                return 0;
            }
        }

        return min;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna