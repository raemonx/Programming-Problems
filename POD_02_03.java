import java.util.ArrayList;
import java.util.Scanner;

public class POD_02_03 {
    static String s="";
    static String t="";

    public static void main(String[] args) {
        console();
        int m = s.length(), n = t.length(),count=0,increment=0,loopCount=0,value=s.length(),min=s.length();
        boolean taboo=false,stop=false;
        int start=0,end=0;
        //loop for substring
        for (int i = 0; i < m; i++) {
            //stop=false;

            for (int j = i; j < m; j++) {
                ArrayList<Integer> arr=new ArrayList<Integer>();
                for (int l = increment; l < n; l++) {

                     for (int k = i; k <=j  ; k++) {

                        char checkN = t.charAt(l);
                        if (checkN == s.charAt(k)&& !arr.contains(k)) {
                            count+=1;
                            increment+=1;
                            //flag=k+1;
                            arr.add(k);
                            break;

                        }
                    }
                    if(count==t.length()) {
                        value=j-i+1;
                        taboo=true;
                    }
                }
                loopCount+=count;
                count=0;
                increment=0;
                if(value<min && value>=t.length()) {
                    min=value;
                    start=i;
                    end=j+1;
                }
            }
        }
        if(taboo!=true|| t.length()>s.length()){
            System.out.println("\"\"");
        }

        System.out.println(s.substring(start,end));

    }
    public static void console(){
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        t=sc.nextLine();
    }

    }

