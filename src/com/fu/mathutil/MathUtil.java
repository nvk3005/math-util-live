package com.fu.mathutil;

/**
 *
 * @author NGUYEN VAN KE
 */
public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument n must be between 0...20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long ans = 1L;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
