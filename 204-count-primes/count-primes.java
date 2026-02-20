class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // Primes strictly less than n
        
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) { // Found a prime
                count++;
                // Mark all multiples of i starting from i*i
                // Use long for i*i to prevent integer overflow
                if ((long)i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isNotPrime[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
