package sushi.sub;
import java.util.Objects;

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

		//countryのnullをチェック
		if (Objects.nonNull(country)) {
			System.out.println("こんにちは！ここは" + country + "です！");
		} else {
			System.out.println("countryは空です");
		}

		//likeのnullをチェック
		if (Objects.nonNull(like)) {
			System.out.println("この" + like + "はうまい");
		} else {
			System.out.println("likeは空です");
		}

		//foodのnullをチェック
		if (Objects.nonNull(food)) {
			System.out.println(like + "は" + food + "です");
		} else {
			System.out.println("foodは空です");
		}

	}

}