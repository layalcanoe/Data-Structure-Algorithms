import java.util.Stack;

public class BracketMatch {

    public static boolean opened(char bracket){
        return (bracket == '{' || bracket == '(' || bracket == '[');
    }

    public static boolean closed(char bracket){
        return (bracket == '}' || bracket == ')' || bracket == ']');
    }

    public static boolean matches(char opening, char closing) {
        return (opening == '{' && closing == '}') || (opening == '(' && closing == ')') || (opening == '[' && closing == ']');
    }

    public static void main (String args[]) {
        String brackets = "{{(}}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char currentChar = brackets.charAt(i);
            if (opened(currentChar)) {
                stack.push(currentChar);
            } else if (closed(currentChar)) {
                if (!stack.isEmpty()) {
                    char top = stack.peek(); 
                    if (!matches(top, currentChar)) {
                        System.out.println("Mismatched brackets");
                        return; 
                    } else {
                        stack.pop(); 
                    }
                } else {
                    System.out.println("Mismatched closing bracket");
                    return; 
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Brackets are matched");
        }
    }
}
