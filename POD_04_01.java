import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class POD_04_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        line1 = line1.substring(1, line1.length() - 1);
        line2 = line2.substring(1, line2.length() - 1);
        String[] prodProg = line1.split(",");
        String[] speeds = line2.split(",");

        ArrayList<Integer> delivery = new ArrayList<Integer>();
        for (int i = 0; i < prodProg.length; i++) {
            delivery.add((int) Math.ceil( ((double)(100 - Integer.parseInt(prodProg[i])) / (double)Integer.parseInt(speeds[i]))));
        }
        String output="";
        //System.out.println(delivery);
        //initialize a stack and hashmap
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < delivery.size(); i++) {
            // if(i==0)
              //  stack.add(delivery.get(i));

            // else {

                if (!stack.isEmpty() && (delivery.get(i) > stack.get(0) )) {
                    output=output.concat("("+stack.get(0)+","+ stack.size()+"),");
                    stack.clear();
                    stack.add(delivery.get(i));
                }
                else
                    stack.add(delivery.get(i));
                    if (i== delivery.size()-1) {
                        output=output.concat("("+stack.get(0)+","+ stack.size()+"),");
                    }
            //}


        }
        System.out.println(output.substring(0,output.length()-1));
    }
}
