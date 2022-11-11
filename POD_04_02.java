import java.util.*;

public class POD_04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(",");

        Queue<Integer> queue = new ArrayDeque<>(length);
        Stack<Integer> noToken = new Stack<>();
        for (String ch: input){
            if(Integer.parseInt(ch) == -1){
                noToken.add(Integer.parseInt(ch));
            }
            else
                queue.add(Integer.parseInt(ch));
        }
        while (!noToken.isEmpty()){
            queue.offer(noToken.pop());
        }
        String output=String.valueOf(queue);
        output=output.replaceAll("\\s", "");
        System.out.println(output.substring(1,output.length()-1).trim());
    }
}
