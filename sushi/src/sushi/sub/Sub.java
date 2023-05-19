package sushi.sub;

public class Sub {

	// 変数を作成
	public String country;
	public String like;
	public String food;

	// Subコンストラクタを作成
	public Sub() {

		// 変数に値を代入
		this.country = "日本";
		this.like = "寿司";
		this.food = "和食";

		// コンソールに出力
		System.out.println("こんにちは！ここは" + country + "です！");
		System.out.println("この" + like + "はうまい");
		System.out.println(like + "は" + food + "です");

	}

}