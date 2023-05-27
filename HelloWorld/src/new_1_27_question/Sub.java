package new_1_27_question;

public class Sub {

	// 変数を定義
	public String animal;
	public double size;
	public int speed;

	public void deta(String animal,double size,int speed) {

		// 入力項目が[ライオン,2.1,80]と一致したときの場合の処理を記述
		if(animal == "ライオン" && size == 2.1 && speed == 80){
			System.out.println("動物名：" + animal);
			System.out.println("体長：" + size +"m");
			System.out.println("速度：" + speed +"km/h");
			System.out.println("学名：" + "パンテラ レオ");

		// 入力項目が[ゾウ:3.2:40]と一致したときの場合の処理を記述
		}else if(animal == "ゾウ" && size == 3.2 && speed == 40){
			System.out.println("動物名：" + animal);
			System.out.println("体長：" + size +"m");
			System.out.println("速度：" + speed +"km/h");
			System.out.println("学名：" + "ロキソドンタ・サイクロティス");

		// 入力項目が[パンダ:1.9:30]と一致したときの場合の処理を記述
		}else if(animal == "パンダ" && size == 1.9 && speed == 30){
			System.out.println("動物名：" + animal);
			System.out.println("体長：" + size +"m");
			System.out.println("速度：" + speed +"km/h");
			System.out.println("学名：" + "アイルロポダ・メラノレウカ");

		// 入力項目が[チンパンジー:0.94:25]と一致したときの場合の処理を記述
		}else if(animal == "チンパンジー" && size == 0.94 && speed == 25){
			System.out.println("動物名：" + animal);
			System.out.println("体長：" + size +"m");
			System.out.println("速度：" + speed +"km/h");
			System.out.println("学名：" + "パン・トゥログロディテス");

		// 入力項目が[シマウマ:2.4:65]と一致したときの場合の処理を記述
		}else if(animal == "シマウマ" && size == 2.4 && speed == 65){
			System.out.println("動物名：" + animal);
			System.out.println("体長：" + size +"m");
			System.out.println("速度：" + speed +"km/h");
			System.out.println("学名：" + "チャップマンシマウマ");

		// 入力項目が[インコ:0.1:50]と一致したときの場合の処理を記述
		}else if(animal == "インコ" && size == 0.1 && speed == 50){
			System.out.println("動物名：" + animal);
			System.out.println("体長：" + size +"m");
			System.out.println("速度：" + speed +"km/h");
			System.out.println("学名：" + "不明");
		}

	}

}