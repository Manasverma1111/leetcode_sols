1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        
4        HashSet<Character> jewelSet = new HashSet<>();
5
6        for (char jewel : jewels.toCharArray()) {
7            jewelSet.add(jewel);
8        }
9
10        int count = 0;
11
12        for (char stone : stones.toCharArray()) {
13            if (jewelSet.contains(stone)) {
14                count++;
15            }
16        }
17
18        return count;
19    }
20}