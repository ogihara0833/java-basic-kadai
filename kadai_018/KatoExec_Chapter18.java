package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        Kato_Chapter18[] family = {
            new KatoTaro_Chapter18(),
            new KatoIchiro_Chapter18(),
            new KatoHanako_Chapter18()
        };

        for (Kato_Chapter18 member : family) {
            member.execIntroduce();
        }
    }
}
