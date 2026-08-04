class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    sc.push('(');
                    break;
                case '[':
                    sc.push('[');
                    break;
                case '{':
                    sc.push('{');
                    break;
                case ')':
                    if (!sc.empty()) {
                        if (sc.pop() != '(') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!sc.empty()) {
                        if (sc.pop() != '{') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!sc.empty()) {
                        if (sc.pop() != '[') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return sc.empty();
    }
}