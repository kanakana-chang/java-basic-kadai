package kadai_015;

public class Car_Chapter15 {
	// フィールド（内部データ）
	private int gear; //1速から5速のギアを表す
	private int speed; //ギアチェンジ後の速度を表す
	
	// コンストラクタ（初期化処理）
	public Car_Chapter15(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	
	// 【メソッド】
	//ギアの値により速度を変える
	public void gearChange(final int afterGear) {
		System.out.println("ギア"+this.gear+"から"+afterGear+"に切り替えました");
		if(afterGear==1) {
			this.speed=10;
		}else if(afterGear==2) {
			this.speed=20;
		}else if(afterGear==3) {
			this.speed=30;
		}else if(afterGear==4) {
			this.speed=40;
		}else if(afterGear==5) {
			this.speed=50;
		}else {
			this.speed=10;
		}
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速"+this.speed+"kmです");
	}

}
