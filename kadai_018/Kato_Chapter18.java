package kadai_018;

abstract public class Kato_Chapter18 {

	//性フィールド
		String familyName = "加藤";
		//名フィールド
		String givenName;
		//住所フィールド
		String address = "住所は東京都中野区〇×です";
		
		
		//メソッド
		//共通の紹介を出力する
		public void commonIntroduce() {
			System.out.println("名前は" + familyName + givenName + "です");
			System.out.println(address);
			
		}
		
		//個別の紹介を出力する
		abstract public void eachIntroduce();{
			
		}
		
		//紹介を実行する
		public void execIntroduce() {
			commonIntroduce();
			eachIntroduce();
			System.out.println();
			
		}
	
}
