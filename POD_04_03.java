import java.util.Scanner;
import java.util.Stack;

public class POD_04_03 {
    public static boolean checkBracket(String string){
        Stack<Character> stack = new Stack<>();

        for (char ch: string.toCharArray()) {
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            if(ch==')'||ch=='}'||ch==']'){
                if(stack.empty())
                    return false;

                char top = stack.pop();

                if(
                        ch==')' && top !='('|| ch=='}' && top !='{' || ch==']' && top !='['
                ){
                    return false;
                }

            }
        }
        return stack.empty();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(checkBracket(input));


    }
}
