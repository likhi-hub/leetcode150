import java.util.ArrayDeque;
import java.util.*;
public class stackprob {
    public static boolean areparenthesisbalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char x = 0;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i);
            if (x == '[' || x == '(' || x == '{')
                stack.push(x);
            continue;
        }
        if (stack.isEmpty())
            return false;
        char check;
        switch (x) {
            case ']':
                check = stack.pop();
                if (check == '{' || check == '(')
                    return false;
                    break;
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                    break;
            case '}':
                check = stack.pop();
                if (check == '[' || check == '(')
                    return false;
                    break;
        }
        return (stack.isEmpty());
    }

    public void main(String[]args){
    String s="([{}])";
    if(areparenthesisbalanced( s))
        System.out.println("balanced");
    else
        System.out.println("not balanced");
}
}
