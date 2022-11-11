import java.util.Scanner;

public class POD_03_03 {
    public static int console(){
        Scanner sc=new Scanner(System.in);
        int input=Integer.parseInt(sc.nextLine());
        return input;
    }

    public static void main(String[] args) {
        int input=console();
        int[] arr=new int[input+1];
        arr[0]=0;
        for (int i = 1; i < arr.length; i++) {
            arr[i]=i;
        }
        for (int j = 4; j < arr.length; j++) {
            arr[j]=arr[j-1]+arr[j-2];

        }
        System.out.println(arr[input]);

    }
}
