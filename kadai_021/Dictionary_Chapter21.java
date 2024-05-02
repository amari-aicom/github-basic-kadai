package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public static void fruitDic(String[] words) {
	HashMap<String, String> dic = new HashMap<String, String>();
	
	dic.put("apple", "りんご");
	dic.put("peach", "桃");
	dic.put("banana", "バナナ");
	dic.put("lemon", "レモン");
	dic.put("pear", "梨");
	dic.put("kiwi", "キウィ");
	dic.put("strawberry", "いちご");
	dic.put("grape", "ぶどう");
	dic.put("muscat", "マスカット");
	dic.put("cherry", "さくらんぼ");

	for(int i = 0; i < words.length; i++) {
		String fruit = words[i];
		if(dic.containsKey(fruit)) {
			System.out.println(fruit + "の意味は" + dic.get(fruit));
		} else {
			System.out.println(fruit + "は辞書に含まれていません");
		}
	}
	}
	
	
	
	
}

