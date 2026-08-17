class Solution {
public:
    bool isValid(string s) {
        std::stack<char> stk;
        for (char c : s) {
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
                std::cout << "added";
            }
            else {
                if (stk.empty()) return false;
                if (c == '}') {
                    if (stk.top() == '{') {
                        stk.pop();
                    }
                    else {
                        return false;
                    }
                 }
                 if (c == ')') {
                    if (stk.top() == '(') {
                        stk.pop();
                    }
                    else {
                        return false;
                    }
                 }
                 if (c == ']') {
                    if (stk.top() == '[') {
                        stk.pop();
                    }
                    else {
                        return false;
                    }
                 }
            }
        }
        if (stk.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
};
