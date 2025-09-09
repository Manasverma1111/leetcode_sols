class Solution {
    public int[] evenOddBit(int n) {
        
        int evenCount = Integer.bitCount(n & 0x55555555);
        int oddCount = Integer.bitCount(n & 0xAAAAAAAA);

        return new int[]{evenCount, oddCount};
    }
}