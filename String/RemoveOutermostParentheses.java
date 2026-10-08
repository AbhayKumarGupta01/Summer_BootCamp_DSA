public class RemoveOutermostParentheses {

    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                // If balance > 0, this is not the outermost '('
                if (balance > 0) {
                    ans.append(c);
                }

                balance++;
            }

            else {

                balance--;

                // If balance > 0, this is not the outermost ')'
                if (balance > 0) {
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "(()())(())";

        String result = removeOuterParentheses(s);

        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}