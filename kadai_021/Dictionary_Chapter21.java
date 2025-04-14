package kadai_021;

import java.util.HashMap;
import java.util.Map;


public class Dictionary_Chapter21 {

	public static Map<String, String> createDictionary() {
        Map<String, String> fruit = new HashMap<>();

        fruit.put("apple", "りんご");
        fruit.put("peach", "もも");
        fruit.put("banana", "バナナ");
        fruit.put("lemon", "レモン");
        fruit.put("pear", "なし");
        fruit.put("kiwi", "キウイ");
        fruit.put("strawberry", "いちご");
        fruit.put("grape", "ぶどう");
        fruit.put("muscat", "マスカット");
        fruit.put("cherry", "さくらんぼ");

        return fruit;
    }

}
