import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String value = sc.next();

            Stack<Character> stack = new Stack<>();

            boolean balanced = true;

            for (int i = 0; i < value.length(); i++) {

                char ch = value.charAt(i);

                // Opening brackets
                if (ch == '(' || ch == '{' || ch == '[') {

                    stack.push(ch);

                } else {

                    // Stack empty
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }

                    char top = stack.pop();

                    // Matching check
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {

                        balanced = false;
                        break;
                    }
                }
            }

            // Extra opening brackets left
            if (!stack.isEmpty()) {
                balanced = false;
            }

            System.out.println(balanced);
        }

        sc.close();
    }
}