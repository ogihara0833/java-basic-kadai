package kadai_021;

import java.util.Map;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		 Map<String, String> fruit = Dictionary_Chapter21.createDictionary();

	        // 判定対象の単語
	        String[] checkWords = {"apple", "banana", "grape", "orange"};

	        // 判定＆出力
	        for (String word : checkWords) {
	            if (fruit.containsKey(word)) {
	                System.out.println(word + " の意味は " + fruit.get(word));
	            } else {
	                System.out.println(word + " は辞書に存在しません");
	            }
	        }
		
	}

}
