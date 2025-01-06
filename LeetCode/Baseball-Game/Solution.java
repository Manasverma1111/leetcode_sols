class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stk = new Stack<>();

        for (String opr : operations) {
            switch(opr) {
                case "C":
                if (!stk.isEmpty()) {
                    stk.pop();
                }
                break;

                case "D":
                if (!stk.isEmpty()) {
                    stk.push(2 * stk.peek());
                }
                break;

                case "+":
                if (stk.size() >= 2) {
                    int top = stk.pop();
                    int newTop = top + stk.peek();
                    stk.push(top);
                    stk.push(newTop);
                }
                break;
            default:
            stk.push(Integer.parseInt(opr));
            break;    
            }
        }

        int sum = 0;
        for (int score : stk) {
            sum += score;
        }

        return sum;
    }
}
