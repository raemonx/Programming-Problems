import java.sql.SQLOutput;
import java.util.Scanner;

public class POD_02_02 {
    static int noOfBuckets=0;
    static int amountOfSand=0;
    public static void main(String[] args) {
        //initialise variables
        int sum=0,min=0;
        console();
        // Case where sand > capacity
        for (int i = 1; i <= noOfBuckets; i++) {
            sum+= i;
        }

            min=minNumber(amountOfSand);
            output(min);


        //print output


    }
    public static void console(){
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        String[] inputs=inp.split(" ");
        noOfBuckets=Integer.parseInt(inputs[0]);
        amountOfSand=Integer.parseInt(inputs[1]);

    }
    public static void output(int output){
        System.out.println(output);
    }

    public static int minNumber(int sand){
        int sum=0,j=1;
        int[] buckets=new int[noOfBuckets+1];
        for (int i = noOfBuckets; i > 0; i--) {
            buckets[j]=i;
            j++;
        }
        if(amountOfSand==0){
            return 0;
        }
        for (int i = 1; i < buckets.length; i++) {
            sum+=buckets[i];
            if(sum>=amountOfSand){
                return i;
            }
        }
        if(noOfBuckets==0){
            if(amountOfSand==0)
                return 0;
            else if(amountOfSand>0)
                return -1;
        }

        return -1;
    }
}
