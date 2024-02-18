class Solution {
    public int reverse(int x) {
        int reverseno = 0;
        
        while (x != 0) {
            int lastno = x % 10;
            // Check for integer overflow before updating reverseno
            if (reverseno > Integer.MAX_VALUE / 10 || (reverseno == Integer.MAX_VALUE / 10 && lastno > 7))
                return 0; // Overflow, return 0
            if (reverseno < Integer.MIN_VALUE / 10 || (reverseno == Integer.MIN_VALUE / 10 && lastno < -8))
                return 0; // Underflow, return 0
            
            reverseno = (reverseno * 10) + lastno;
            x = x / 10;
        }
        
        return reverseno;
    }
}
