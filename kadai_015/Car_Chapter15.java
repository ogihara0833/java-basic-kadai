package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;
    private int speed = 10;

    // コンストラクタ
    public Car_Chapter15() {
        setSpeedByGear(gear);
    }

 // ギアチェンジ用メソッド（ギア変更メッセージを追加）
    public void gearChange(int afterGear) {
        int beforeGear = this.gear;
        this.gear = afterGear;
        setSpeedByGear(afterGear);
        System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました。");
    }

    // 走行メソッド（ギアチェンジ後の速度を表示）
    public void run() {
        System.out.println("現在のギア: " + gear + "速、速度: " + speed + "km/h");
    }

    // ギアに応じて速度を設定するプライベートメソッド
    private void setSpeedByGear(int gear) {
        switch (gear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10; // 想定外のギア
        }
    }

   
}
