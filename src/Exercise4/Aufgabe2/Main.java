package Exercise4.Aufgabe2;

/**
 * Created by Nikita on 22.03.2021 at 20:21
 */
public class Main {
    public static void main(String[] args) {
        // # 1 Lader
//        LaderImpl lader = new LaderImpl("Catpillar 903D", 42,4612, 5, 1) {
//        };
//        lader.druckeBeschreibung();
////        lader.laden();
////        System.out.println(lader.getBetriebsStunden());
//
//        // # 2 Bagger
//        BaggerImpl bagger = new BaggerImpl("Catpillar 311F L RR", 71,14500,9,13) {
//        };
//        bagger.druckeBeschreibung();
//        bagger.graben();
//        bagger.graben();
//        System.out.println(bagger.getBetriebsStunden());

        // # 3 Baggerlader
        BaggerLaderImpl baggerLader = new BaggerLaderImpl("Caterpillar - 428F2 4x4 Backhoe loader", 550, 8425, 10,12, 10,6){};
        baggerLader.druckeBeschreibung();
        baggerLader.graben();
        baggerLader.laden();
        System.out.println(baggerLader.getBetriebsStunden());
    }
}
