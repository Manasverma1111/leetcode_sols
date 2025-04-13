        long result = (evenWays * oddWays) % MOD;
        return (int) result;
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
