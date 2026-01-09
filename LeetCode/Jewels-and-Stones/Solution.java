1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        
4        HashSet<Character> jewelSet = new HashSet<>();
5        for (char jewel : jewels.toCharArray()) {
6            jewelSet.add(jewel);
7        }
8
9        int count = 0;
10        for (char stone : stones.toCharArray()) {
11            if (jewelSet.contains(stone)) {
12                count++;
13            }
14        }
15
16        return count;
17        
18    }
19}