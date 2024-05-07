package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
        Jyanken_Chapter26 j = new Jyanken_Chapter26();
        String myChoice = j.getMyChoice();
        String aite = j.getRandom();
        j.playGame(myChoice, aite);
    }
}
