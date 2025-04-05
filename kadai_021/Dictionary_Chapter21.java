package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void dictionary(String[] words) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> dict = new HashMap<String,String>();
		
		dict.put("apple","りんご");
		dict.put("peach","桃");
		dict.put("banana","バナナ");
		dict.put("lemon","レモン");
		dict.put("pear","梨");
		dict.put("kiwi","キウィ");
		dict.put("strawberry","いちご");
		dict.put("grape","ぶどう");
		dict.put("muscat","マスカット");
		dict.put("cherry","さくらんぼ");
		
		for(String word:words) {
			if(dict.containsKey(word)) {
				System.out.println(word+"の意味は"+dict.get(word));
			}else {
				System.out.println(word+"は辞書に存在しません");
			}
		}
	}

}
