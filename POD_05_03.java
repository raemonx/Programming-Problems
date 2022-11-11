import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class POD_05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] inputs = sc.nextLine().split(",");
        int[] inp = Stream.of(inputs).mapToInt(Integer::parseInt).toArray();

        if(inp.length!=1){
        int diffMax = inp[1]-inp[0];
        int min= inp[0];
        for (int i = 0; i < inp.length; i++) {
            if(inp[i]-min > diffMax)
                diffMax = inp[i]-min;
            if(inp[i]<min)
                min=inp[i];
        }
        System.out.println(diffMax);
    }
        else System.out.println(0);
    }
}
