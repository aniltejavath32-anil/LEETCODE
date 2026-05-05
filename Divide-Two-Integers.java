1class Solution {
2    public int divide(int dividend, int divisor) {
3        // Handle overflow case: -2^31 / -1 = 2^31 (which overflows)
4        if (dividend == Integer.MIN_VALUE && divisor == -1) {
5            return Integer.MAX_VALUE;
6        }
7
8        // Determine the sign of the result
9        boolean negative = (dividend < 0) ^ (divisor < 0);
10
11        // Work with negative numbers to avoid overflow with Integer.MIN_VALUE
12        long longDividend = Math.abs((long) dividend);
13        long longDivisor = Math.abs((long) divisor);
14
15        int quotient = 0;
16        
17        while (longDividend >= longDivisor) {
18            long tempDivisor = longDivisor;
19            int multiple = 1;
20            
21            while (longDividend >= (tempDivisor << 1)) {
22                tempDivisor <<= 1;
23                multiple <<= 1;
24            }
25            
26            longDividend -= tempDivisor;
27            quotient += multiple;
28        }
29
30        return negative ? -quotient : quotient;
31    }
32}
33