package codes;

public class Example {

    /**
     * Constructor
     */
    public Example () {

    }

    /**
     * 09.09 challenge
     * <p>
     * Compare two version numbers version1 and version2.
     * @param version1 version 1 in string
     * @param version2 version 2 in string
     * @return 1 if version 1 later than version2, -1 if version 1 earlier 
     * than version 2, or 0 if they are the same
     */
    public int compareVersion(String version1, String version2) {
        String[] version1Splitted = version1.split("\\.");
        String[] version2Splitted = version2.split("\\.");

        for (int i = 0;
                i < Math.max(version1Splitted.length, version2Splitted.length);
                i++) {
            String compareNum1 = i < version1Splitted.length ?
                    version1Splitted[i] : "0";
            String compareNum2 = i < version2Splitted.length ?
                    version2Splitted[i] : "0";

            if (Integer.parseInt(compareNum1) < Integer.parseInt(compareNum2)) return -1;
            if (Integer.parseInt(compareNum1) > Integer.parseInt(compareNum2)) return 1;
        }

        return 0;
    }

    /**
     * 09.10 Challenge
     * @param secret the given number
     * @param guess the number that guess
     * @return "xAyB", where x indicates how many correct positions, and y
     * indicates how many correct numbers. Counted number in x-calculation
     * should not be counted for y-calculation again.
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
     * @param nums array
     * @return a subarray in {@code nums} that gives a maximum product
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
