// https://leetcode.com/problems/longest-valid-parentheses/
class Solution {
    // T(n): O(n), S(n): O(n)
    public int longestValidParentheses(String s) {
        int n = s.length(); int longest = 0;
        char ch;
        Stack<Integer> st = new Stack<>();
        
        // Fill stack and pop balanced parenthesis
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                if (!st.empty()) {
                    if (s.charAt(st.peek()) == '(') {
                        st.pop();
                    } else {
                        st.push(i);
                    }
                } else {
                    st.push(i);
                }
            }
        }
        
        // What is left in stack are unbalanced parenthesis.
        // The max difference between two adjacent indices is the answer. 
        if (st.empty()) {
            longest = n;
        } else {
            int a = n, b = 0;
            
            while (!st.empty()) {
                b = st.pop();
                longest = Math.max(longest, a-b-1);
                a = b;
            }
            longest = Math.max(longest, a);
        }
        
        return longest;
        
    }
}
