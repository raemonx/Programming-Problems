import java.util.Scanner;

public class POD_02_01 {
    static int i=0;

    public static void main(String[] args) {
        int count=0,sum=0;
        boolean stop=false,neverEntered=true;
        String[] inputs= console();
        for (int i = 0; i < inputs.length; i++) {
            stop=false;
            for (int j = 0; j < inputs[i].length() && !stop; j++) {
                char locator=inputs[i].charAt(j);
                for (int k = 0; k < inputs.length ; k++) {
                    if(j<inputs[k].length()){
                            if (j!=0 &&inputs[i].charAt(j-1)!=inputs[k].charAt(j-1)){
                                continue;
                            }
                            if (locator == inputs[k].charAt(j)) {
                                count += 1;
                            }

                        }
                    }
                if(count>1){
                    count=0;
                    continue;
                    }
                if(count==1){
                    neverEntered=false;
                    sum+=j+1;
                    stop=true;
                    count=0;
                    }
                }
            if(neverEntered==true){
                    sum+=inputs[i].length();
                }
            neverEntered=true;
            }
        System.out.println(sum);
        }

    public static String[] console(){
        Scanner sc=new Scanner((System.in));
        String inp=sc.nextLine();
        String[] inputs=inp.split(",");
        i= inputs.length;
        return inputs;
    }
}
