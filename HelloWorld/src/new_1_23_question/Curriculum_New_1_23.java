package new_1_23_question;

public class Curriculum_New_1_23 {

	/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

	 */

	public static void main(String[] args) {

		// Animalをコンソールに出力する為にインスタンスanを作成
		Curriculum_New_1_23 an = new Curriculum_New_1_23();
		// セッターを呼び出して変数animalに文字列を代入
		an.setAnimal("ライオン");

		// 変数animalをコンソールに出力
		System.out.println("動物名：" + an.getAnimal());

		//　sizeをコンソールに出力する為にインスタンスsiを作成
		Curriculum_New_1_23 si = new Curriculum_New_1_23();
		// セッターを呼び出して変数siに文字列を代入
		si.setSize(2.1);

		// 変数siをコンソールに出力
		System.out.println("体長：" + si.getSize() + "m");

		//　speedsをコンソールに出力する為にインスタンスspを作成
		Curriculum_New_1_23 sp = new Curriculum_New_1_23();
		// セッターを呼び出して変数speedsに文字列を代入
		sp.setSpeeds(80);

		// 変数spをコンソールに出力
		System.out.println("速度：" + sp.getSpeeds() + "km/h");

	}

	// ------------------------------------------------------------------------

	// 変数animalを定義
	private String animal;
	// 変数sizeを定義
	private double size;
	// 変数speedsを定義
	private int speeds;

	// ------------------------------------------------------------------------

	// 変数animalのセッターを作成
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	// 変数sizeのセッターを作成
	public void setSize(double size) {
		this.size = size;
	}
	// 変数speedsのセッターを作成
	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}

	// ------------------------------------------------------------------------

	// 変数animalのゲッターを作成
	public String getAnimal() {
		return animal;
	}
	// 変数sizeのゲッターを作成
	public double getSize() {
		return size;
	}
	// 変数speedsのゲッターを作成
	public int getSpeeds() {
		return speeds;
	}

}

