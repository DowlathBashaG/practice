package dowlath.io.practice.dv;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{()}";
        boolean isItValidParenthesis = isItValid(s);
        System.out.println("Valid Parenthesis .... :" + isItValidParenthesis);
    }

    private static boolean isItValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '{' || c == '(' || c=='['){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == ']')){
                        stack.pop();
                    } else{
                        return  false;
                    }

                }
            }
        }
        return stack.isEmpty();
    }
}
