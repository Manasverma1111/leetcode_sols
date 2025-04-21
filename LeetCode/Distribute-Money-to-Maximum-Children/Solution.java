class Solution {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        
        int max_possible = Math.min(children, money / 8);
        for (int k = max_possible; k >= 0; k--) {
            int remaining_money = money - 8 * k;
            int remaining_children = children - k;
            
            if (remaining_money < remaining_children) {
                continue;
            }
            
            if (remaining_children == 0) {
                if (remaining_money == 0) {
                    return k;
                } else {
                    continue;
                }
            }
            
            int extra = remaining_money - remaining_children;
            if (extra == 0) {
                return k;
            }
            
            if (extra == 3 && remaining_children == 1) {
                continue;
            }
            
            if (extra < 0) {
                continue;
            }
            
            return k;
        }
        
        return -1;
    }
}