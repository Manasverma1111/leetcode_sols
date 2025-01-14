class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int[] C = new int[n];
        Set<Integer> seenInA = new HashSet<>();
        Set<Integer> seenInB = new HashSet<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            seenInA.add(A[i]);
            seenInB.add(B[i]);

            if (seenInB.contains(A[i])) {
                commonCount++;
            }
            if (seenInA.contains(B[i]) && B[i] != A[i]) {
                commonCount++;
            }

            C[i] = commonCount;
        }

        return C;
    }
}
