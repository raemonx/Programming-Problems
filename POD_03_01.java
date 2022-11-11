import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class POD_03_01 {
    static String line1,line2;
    public static void console(){
        Scanner sc=new Scanner(System.in);
        line1=sc.nextLine();
        line2=sc.nextLine();
        line1=line1.substring(1, line1.length()-1);
        line2=line2.substring(1,line2.length()-1);

    }

    public static void main(String[] args) {
        console();
        int check=0, equal=0,count=0,output=0;
        String[] inputID=line1.split(" ");
        String[] bl=line2.split(" ");
        ArrayList<String> out=new ArrayList<>();
        ArrayList<Integer> mult= new ArrayList<>();
        List<String> sets= Arrays.asList(inputID);
        List<String> blacklist= Arrays.asList(bl);
        for (int i = 0; i < blacklist.size(); i++) {
            count=0;
            for (int j = 0; j < sets.size(); j++) {
                check=0;
                for (int k = 0; k < blacklist.get(i).length() && sets.get(j).length()>=blacklist.get(i).length(); k++) {
                    if(blacklist.get(i).charAt(k)==sets.get(j).charAt(k)) {
                        check += 1;
                    }
                    if(blacklist.get(i).charAt(k)=='*'){
                        check += 1;
                    }
                }
                if(check==blacklist.get(j).length()){
                    count+=1;
                    out.add(sets.get(j));
                }
            }
            if(count>1)
                mult.add(count);
            else if(count==1)
                mult.add(1);

        }

        for(int i:mult){
            output *= i;
        }
        System.out.println(output);
    }
}
