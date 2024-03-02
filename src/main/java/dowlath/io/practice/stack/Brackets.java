package dowlath.io.practice.stack;

import java.util.Stack;

/*
      Rule :
             left bracket push....
             right bracket pop....
 */
public class Brackets {
    public static void main(String[] args) {
        System.out.println(new Brackets().solution("{()]"));
      //  System.out.println(new Brackets().solution("{()}"));
    }

    private boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
                ;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}