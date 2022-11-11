import java.util.ArrayList;
import java.util.Scanner;

public class POD_03_02 {
    static int N;
    static String input;

    public static void console(){
        Scanner sc = new Scanner(System.in);
        String fline=sc.nextLine().trim();
        N=Integer.parseInt(fline);
        input=sc.nextLine().trim();
    }

    public static void main(String[] args) {
        console();
        String[] inputs=input.split(",");
        ArrayList<Integer> elements= new ArrayList<Integer>();
        for (int i = 0; i < inputs.length; i++) {
           elements.add(Integer.parseInt(inputs[i]));
        }
        output(checkPeak(elements));

    }
    public static int checkPeak(ArrayList<Integer> arr){
        int max=0,peak=0,index=0;
        for (int i = 1; i < arr.size()-1; i++) {
            if(arr.get(i).intValue()>arr.get(i-1).intValue() && arr.get(i).intValue()>arr.get(i+1).intValue()){
                peak= Math.max(Math.abs(arr.get(i-1).intValue()-arr.get(i).intValue()),Math.abs(arr.get(i).intValue()-arr.get(i+1).intValue()));
                if(peak>max){
                    max+=peak;
                    index=i;
                }
            }
        }
        if(max==0)
            return -1;
        else
            return index;
    }
    public static void output(int output){
        System.out.println(output);
    }
}
