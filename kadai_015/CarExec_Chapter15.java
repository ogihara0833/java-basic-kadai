package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        Car_Chapter15 car = new Car_Chapter15(); // 初期ギア3、速度30km/h
        printStatus(car); // 初期状態の表示

        car.gearChange(4); // ギア3から4へ
        printStatus(car);

        car.gearChange(1); // ギア4から1へ
        printStatus(car);

        car.gearChange(7); // ギア1から7へ（想定外）
        printStatus(car);
    }

    // 車の現在の状態（速度）を表示するメソッド
    private static void printStatus(Car_Chapter15 car) {
        System.out.print("→ ");
        car.run(); // ギア・速度表示
        System.out.println(); // 空行で見やすくする
    }
}
