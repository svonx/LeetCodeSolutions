package codes;

public class Example {

    /**
     * Constructor
     */
    public Example () {

    }

    /**
     * 09.10 Challenge
     * @param secret
     * @param guess
     * @return
     */
    public String getHint(String secret, String guess ) {
        int A = 0;
        int B = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
                secret = changeString(secret, i, '-');
                guess = changeString(guess, i, '-');
            }
        }

        for (int i = 0; i < guess.length(); i++) {
            char currChar = guess.charAt(i);
            if (currChar == '-') continue;

            if (secret.indexOf(currChar) > -1) {
                B++;
                secret = changeString(secret, secret.indexOf(currChar), '-');
                guess = changeString(guess, i, '-');
            }
        }

        return A + "A" + B + 'B';
    }

    public String changeString(String pre, int index, char after) {
        StringBuilder sb = new StringBuilder(pre);
        sb.setCharAt(index, after);
        return sb.toString();
    }

    /**
     * 09.11 Challenge
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currMax = nums[i];
            int currProduct = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                currProduct *= nums[j];
                currMax = Math.max(currMax, currProduct);
            }

            result = Math.max(currMax, result);
        }

        return result;
    }
}
