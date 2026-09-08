class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> opn = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
                opn.push(Integer.parseInt(c));
            } else {
                int opn2 = opn.pop();
                int opn1 = opn.pop();
                switch (c) {
                    case "+": {
                        opn.push(opn1 + opn2);
                        break;
                    }
                    case "-": {
                        opn.push(opn1 - opn2);
                        break;
                    }
                    case "*": {
                        opn.push(opn1 * opn2);
                        break;
                    }
                    case "/": {
                        opn.push(opn1 / opn2);
                        break;
                    }
                }
            }
        }
        return opn.pop();
    }
}