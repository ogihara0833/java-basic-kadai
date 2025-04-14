package kadai_021;

import java.util.Map;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // Dictionary_Chapter21 クラスのインスタンスを生成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 辞書データを取得
        Map<String, String> fruit = dictionary.getFruitDictionary();

        // 判定対象の単語
        String[] checkWords = {"apple", "banana", "grape", "orange"};

        // 判定と出力
        for (String word : checkWords) {
            if (fruit.containsKey(word)) {
                System.out.println(word + " の意味は " + fruit.get(word));
            } else {
                System.out.println(word + " は辞書に存在しません");
            }
        }
    }
}
