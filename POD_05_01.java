import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class POD_05_01 {


    public static Map<String,String> wordsList = new HashMap<>();

    public static int languages;
    public static Scanner sc=new Scanner(System.in);

    public static void console(){

        languages = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < languages; i++) {
            String[] words=sc.nextLine().split(" ");
            for(int j=1;j<words.length;j++){
                wordsList.put(words[j].toLowerCase(), words[0]);
            }
        }


    }
    public static void main(String[] args) {
            console();
            String[] list;

        while (sc.hasNextLine()) {
            list = sc.nextLine().split("([!@#$%^&*()=+|~\\[\\]{};:“,.?<>]|\\s)");
            for (String words : list) {
                if (wordsList.containsKey(words.toLowerCase())) {
                    System.out.println(wordsList.get(words.toLowerCase()));
                    break;
                }
            }
        }

    }
}
