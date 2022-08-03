import java.util.Stack;

public class Staples {
    public static boolean testStaples(String string) {

        char[] chars;

        chars = string.toCharArray();

        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '{' || chars[i] == '(' || chars[i] == '[' || chars[i]=='<') {

                characters.push(chars[i]);

            }else if((chars[i] == '}' || chars[i] == ')' || chars[i] == ']'||chars[i]=='>')){

                characters.pop();
            }

        }

        return characters.size()==0;

    }

    public static void main(String[] args) {


        String example = "{3*(3+6})(";

        System.out.println(testStaples(example));

    }
}
