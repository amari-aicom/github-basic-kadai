package kadai_026;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public static String getMyChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        String myChoice = scanner.nextLine();
        
        if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")){
            return myChoice;
        } else {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        myChoice = scanner.nextLine();
        }
        return myChoice;
    }

    public static String getRandom(){
        String[] baseAite = {"r", "s", "p"};
        double i = Math.floor(Math.random() * 3);

        String aite = baseAite[(int)i];
        return aite;
    }

    public static void playGame(String myChoice, String aite){
        Map<String, String> janken = new HashMap<String, String>();
        janken.put("r", "グー");
        janken.put("s", "チョキ");
        janken.put("p", "パー");

        System.out.println("自分の手は" + janken.get(myChoice) + "、対戦相手の手は" + janken.get(aite));

        switch(myChoice){
            case "r" : switch(aite){
                case "r" -> System.out.println("あいこです");
                case "s" -> System.out.println("自分の勝ちです");
                case "p" -> System.out.println("自分の負けです");
            }
            break;
            case "s" : switch(aite){
                case "r" -> System.out.println("自分の負けです");
                case "s" -> System.out.println("あいこです");
                case "p" -> System.out.println("自分の勝ちです");
            }
            break;
            case "p" : switch(aite){
                case "r" -> System.out.println("自分の勝ちです");
                case "s" -> System.out.println("自分の負けです");
                case "p" -> System.out.println("あいこです");
            }
            break;
        }

    }
}
