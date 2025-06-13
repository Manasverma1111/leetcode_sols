class Solution {
    public int findMinFibonacciNumbers(int k) {

        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);

        while (fib.get(fib.size() - 1) < k) {
            int n = fib.size();
            fib.add(fib.get(n - 1) + fib.get(n - 2));
        }   

        int count = 0;
        int fibSize = fib.size() - 1;

        while (k > 0) {
            if (fib.get(fibSize) <= k) {
                k -= fib.get(fibSize);
                count++;
            }
            fibSize--;
        }

        return count;
    }
}