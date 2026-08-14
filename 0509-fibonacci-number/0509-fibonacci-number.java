class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }

        // Recursive case: calculate previous two terms
        int last = fib(N - 1);    // (N-1)th term
        int slast = fib(N - 2);   // (N-2)th term

        return last + slast;
    }
}