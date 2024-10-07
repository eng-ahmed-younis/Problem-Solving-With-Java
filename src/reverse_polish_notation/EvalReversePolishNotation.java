package reverse_polish_notation;

import java.util.Stack;

public class EvalReversePolishNotation {

    public static int evalPPN(String[] token) {
        int result = 0;
        String validOperator = "+-*/";
        Stack<String> stack = new Stack<String>();

        for (String t : token){
            if (validOperator.contains(t)){
                int r = 0;
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                switch(t){
                    case "+" :
                        r = num1 + num2;
                        break;
                    case "-" :
                        r = num1 - num2;
                        break;
                    case "/":
                        r = num1 / num2;
                        break;
                    case "*" :
                        r = num1 * num2;
                        break;
                    default: {}
                }
                stack.push(String.valueOf(r));

            }else {
                stack.push(t);
            }
        }

        result = Integer.parseInt(
                stack.pop()
        );
        return result;


    }
}
