package medium;

import java.util.Deque;

public class reversePolishNotation {
    /*
    Evaluate the value of an arithmetic expression in Reverse Polish Notation.
    Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
    Note that division between two integers should truncate toward zero.
    It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
    Example:
    Input: tokens = ["2","1","+","3","*"]
    Output: 9
    Explanation: ((2 + 1) * 3) = 9
    */
   public static void main(String[] args) {

    reversePolishNotation obj = new reversePolishNotation();
    String[] tokens = {"2","1","+","3","*"};
    int result = obj.evalRPN(tokens);
    System.out.println(result);
   }
    public int evalRPN(String[] tokens) {
        // O(n) time complexity, O(n) space complexity
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int res = applyOperation(a, b, token);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
}
