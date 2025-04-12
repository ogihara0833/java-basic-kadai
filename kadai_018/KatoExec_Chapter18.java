package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
    	 KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
         taro.setGivenName();

         KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
         ichiro.setGivenName();

         KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
         hanako.setGivenName();

         Kato_Chapter18[] family = { taro, ichiro, hanako };

        for (Kato_Chapter18 member : family) {
            member.execIntroduce();
        }
    }
}
