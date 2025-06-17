class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0;
        int cookiesIndex = 0;

        while(childIndex < g.length && cookiesIndex < s.length){

            if(s[cookiesIndex] >= g[childIndex]){
                childIndex++;
            }

            cookiesIndex++;
        }

        return childIndex;
    }
}